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
    private static AudioClip[] clips=new AudioClip[4];
    private static int[] musicTime=new int[4];
    private static int currentMusic;
    static void musicControler(){
        clips[currentMusic].stop();
        int i= (int)(4*Math.random());
        currentMusic=i;
        clips[i].play();
        executorService.schedule(new switchSong(),musicTime[i], TimeUnit.SECONDS);
    }
    static void initMusicControler(){
        try{
            clips[0]= Applet.newAudioClip(new File("music/c418 - alpha.wav").toURI().toURL());
            musicTime[0]=10*60+3;

            clips[1]= Applet.newAudioClip(new File("music/c418 - blind spots.wav").toURI().toURL());
            musicTime[1]=5*60+32;

            clips[2]= Applet.newAudioClip(new File("music/c418 - dead voxel.wav").toURI().toURL());
            musicTime[2]=4*60+56;

            clips[3]= Applet.newAudioClip(new File("music/c418 - ki.wav").toURI().toURL());
            musicTime[3]=60+32;

            musicControler();
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}
class switchSong implements Runnable{
    @Override
    public void run() {
        MusicThreadExecutor.musicControler();
    }
}