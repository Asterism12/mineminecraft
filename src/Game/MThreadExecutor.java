package Game;

import Thing.Square;
import Thing.Weapon.Weapon;

import java.awt.*;
import java.util.concurrent.*;

public class MThreadExecutor {
    private ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
    private ScheduledFuture<?> oldFuture;
    private Point squareLocation;

    synchronized void destroyThread(Square square, Point location) {
        int squareAtk = 1;
        if (World.player.getHandSquare() instanceof Weapon) {
            Weapon weapon = (Weapon) World.player.getHandSquare();
            squareAtk = weapon.squareAtk;
        }
        if (oldFuture != null) {
            oldFuture.cancel(true);
            oldFuture = null;
        }
        if (squareAtk >= square.breakLevel) {
            squareLocation = location;
            int breakLevel = square.breakLevel > 0 ? square.breakLevel : 1;
            long delay = 500 - (int) ((double) (squareAtk - breakLevel) / squareAtk) * 500;
            oldFuture = executorService.schedule(new Destroy(), delay, TimeUnit.MILLISECONDS);
        }
    }

    synchronized void cancelDestroy() {
        if (oldFuture != null) {
            oldFuture.cancel(true);
            oldFuture = null;
        }
    }

    void destroy() {
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