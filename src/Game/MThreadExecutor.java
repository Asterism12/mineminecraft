package Game;

import Thing.Square;
import Thing.Weapon.Weapon;

import java.awt.*;
import java.util.concurrent.*;

public class MThreadExecutor {
    private ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
    private ScheduledFuture<?> oldFuture;
    private Point squareLocation;
    private int signal = 0;

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
            long delay = 1000 - (int) ((double) (squareAtk - square.breakLevel) / square.breakLevel) * 1000;
            oldFuture = executorService.schedule(new Destroy(), delay, TimeUnit.MILLISECONDS);
            this.notifyAll();
            signal = 0;
        }
    }

    synchronized void cancelDestroy() {
        if (oldFuture != null) {
            signal = 1;
            oldFuture.cancel(true);
            oldFuture = null;
        } else {
        }
    }

    void destroy() {
        if(signal==0) {
            World.worldSquare[squareLocation.x][squareLocation.y] = null;
            oldFuture = null;
            //System.out.println("des");
        }
    }
}

class Destroy implements Runnable {
    @Override
    public void run() {
        World.mThreadExecutor.destroy();
    }
}