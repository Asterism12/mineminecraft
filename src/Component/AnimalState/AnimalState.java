package Component.AnimalState;

import Component.Animals.Animal;
import Component.Animals.Cow;
import Game.World;

import java.awt.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class AnimalState {
    private static ArrayList<Animal> animals = new ArrayList<>();
    private boolean standing;
    private static Timer timer = new Timer();

    static{
        animals.add(new Cow());
    }

    public static void addAnimal(Animal animal)
    {
        animals.add(animal);
    }

    public static ArrayList<Animal> updateAnimalList()
    {

    }
    public static ArrayList<Animal> getAnimalList()
    {
        return animals;
    }
}

    private void printAnimal(Graphics g)
    {
        for(int i = 0;i < animals.size();i++)
        {
            Animal animal = animals.get(i);
            standing = true;
            Point.Double location = animal.getLocation();

            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    int xbias, ybias;//人物相对于脚下物块的位置像素偏移量
                    xbias = (int) ((location.x - (int) World.player.getLocation().x));
                    ybias = (int) ((location.y - (int) World.player.getLocation().y));
                    if(Math.abs(xbias) <= 500 && Math.abs(ybias) <= 400)
                    {
                        xbias += 500;
                        ybias += 400;
                    }
                }
            },0,5*World.FPS);


        }
    }