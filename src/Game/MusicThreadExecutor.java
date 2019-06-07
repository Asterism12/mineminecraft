package Game;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MusicThreadExecutor {
    private static ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService walkService = Executors.newSingleThreadScheduledExecutor();
    private static AudioClip step;
    private static AudioClip stone;
    private static AudioClip[] clips=new AudioClip[4];
    private static int[] musicTime=new int[4];
    private static int currentMusic;

    static void playWalkSong(){
        step.play();
    }

    static void loopStoneSound(){
        stone.loop();
    }

    static void stopStoneSound(){
        stone.stop();
    }

    static void musicController(){
        clips[currentMusic].stop();
        int i= (int)(4*Math.random());
        currentMusic=i;
        clips[i].play();
        executorService.schedule(new SwitchSong(),musicTime[i], TimeUnit.SECONDS);
    }

    static void initMusicController(){
        try{
            step= Applet.newAudioClip(new File("music/step.wav").toURI().toURL());
            stone= Applet.newAudioClip(new File("music/stone.wav").toURI().toURL());

            clips[0]= Applet.newAudioClip(new File("music/alpha.wav").toURI().toURL());
            musicTime[0]=10*60+3;

            clips[1]= Applet.newAudioClip(new File("music/blind spots.wav").toURI().toURL());
            musicTime[1]=5*60+32;

            clips[2]= Applet.newAudioClip(new File("music/dead voxel.wav").toURI().toURL());
            musicTime[2]=4*60+56;

            clips[3]= Applet.newAudioClip(new File("music/ki.wav").toURI().toURL());
            musicTime[3]=60+32;

            musicController();
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}
class SwitchSong implements Runnable{
    @Override
    public void run() {
        MusicThreadExecutor.musicController();
    }
}