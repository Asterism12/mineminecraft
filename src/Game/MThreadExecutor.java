package Game;

import Thing.Square;
import Thing.Tool.Tool;

import java.awt.*;
import java.util.concurrent.*;

public class MThreadExecutor {
    private ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
    private ScheduledFuture<?> oldFuture;
    private Point squareLocation;

    synchronized void destroyThread(Square square, Point location) {
        int squareAtk = 0;
        Tool tool = null;
        if (World.player.getHandSquare() instanceof Tool) {
            tool = (Tool) World.player.getHandSquare();
            squareAtk = tool.digLevel;
        }
        if (oldFuture != null) {
            oldFuture.cancel(true);
            oldFuture = null;
        }
        if (squareAtk >= square.breakLevel) {
            MusicThreadExecutor.loopStoneSound();
            squareLocation = location;
            //old version
            //long delay = 1000 - (int) ((double) (squareAtk - breakLevel) / squareAtk) * 200;
            long delay;
            if (tool != null&&tool.digKind==square.digType) {
                delay = 1000 - tool.digSpeed * 200;
            } else {
                delay = 1000 + square.breakLevel * 200;
            }
            System.out.println("delay:"+delay);
            oldFuture = executorService.schedule(new Destroy(), delay, TimeUnit.MILLISECONDS);
        }
    }

    synchronized void cancelDestroy() {
        if (oldFuture != null) {
            MusicThreadExecutor.stopStoneSound();
            oldFuture.cancel(true);
            oldFuture = null;
        }
    }

    void destroy() {
        MusicThreadExecutor.stopStoneSound();
        World.player.getToolbar().pickUp(World.worldSquare[squareLocation.x][squareLocation.y]);
        World.worldSquare[squareLocation.x][squareLocation.y] = null;
        oldFuture = null;
    }
}

class Destroy implements Runnable {
    @Override
    public void run() {
        World.mThreadExecutor.destroy();
    }
}