package Component.AnimalState;

import Component.Animals.*;
import Game.World;
import Thing.Square;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class AnimalState {
    private static ArrayList<Animal> animals = new ArrayList<>();
    private static Random random = new Random(System.currentTimeMillis());
    private static double fallVelocity = 0.0;

    public static void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public static ArrayList<Animal> getAnimalList() {
        return animals;
    }

    public static void updateDir() {
        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);

            int cnt = (random.nextInt(40) + 1) % 8;
            if (cnt == 0) {
                animal.setWalking(true);
                animal.setDir(true);
            }
            else if (cnt == 4) {
                animal.setWalking(true);
                animal.setDir(false);
            }
            else {
                animal.setWalking(false);
                animal.setStanding(false);
            }
            //change the pic
            if (animal.getStanding())
                animal.setStanding(false);
            else if (!animal.getStanding())
                animal.setStanding(true);
        }
    }

    public static void updateAnimalLocation() {
        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);

            //determine the direction and make movement
            boolean dir = animal.getDir();
            boolean walking = animal.getWalking();
            int x = (int) animal.getLocation().x;
            int y = (int) animal.getLocation().y;
            if (World.worldSquare[x][y] == null || fallVelocity != 0) {
                double targetY = animal.getLocation().y + fallVelocity;
                Square square = World.worldSquare[x][(int) targetY];
                if (fallVelocity > 0 && square != null && !square.through) {
                    animal.setLocationy((int) (targetY) - 0.01); //avoid getting stuck in the dirt
                    fallVelocity = 0.2;
                } else {
                    animal.setLocationy(targetY);
                    if (fallVelocity <= 1)
                        fallVelocity += World.gravity;
                }
            }

            if(walking)
            {
                if (dir) {
                    double targetX = animal.getLocation().x - animal.getVelocity();
                    Square square = World.worldSquare[(int) targetX][(int) animal.getLocation().y];

                    if (square == null)
                        animal.setLocationx(targetX);
                    else if (!square.through)
                        animal.setLocationx(Math.ceil(targetX));
                    else
                        animal.setLocationx(targetX);
                } else {
                    double targetX = animal.getLocation().x + animal.getVelocity();
                    Square square = World.worldSquare[(int) targetX][(int) animal.getLocation().y];

                    if (square == null)
                        animal.setLocationx(targetX);
                    else if (!square.through)
                        animal.setLocationx((int) targetX - 0.01);
                    else
                        animal.setLocationx(targetX);
                }
            }
        }
    }

    public static void adjustBorn()
    {
        for(Animal animal : animals)
        {
            int x,y;
            x = (int)animal.getLocation().x;
            y = (int)animal.getLocation().y;
            while (World.worldSquare[x][y] != null) y--;
            animal.setLocationy(y);
        }
    }

    public static void init()
    {
        //initial the animallist -- create some creatures
        AnimalState.getAnimalList().add(new Cow(new Point.Double(2020,240)));
        AnimalState.getAnimalList().add(new Cow(new Point.Double(1024,240)));
        AnimalState.getAnimalList().add(new Cow(new Point.Double(1800,240)));
        AnimalState.getAnimalList().add(new Cow(new Point.Double(500,240)));
        AnimalState.getAnimalList().add(new Pig(new Point.Double(2034,240)));
        AnimalState.getAnimalList().add(new Pig(new Point.Double(2010,240)));
        AnimalState.getAnimalList().add(new Pig(new Point.Double(1624,240)));
        AnimalState.getAnimalList().add(new Skeleton(new Point.Double(2050,240)));
        AnimalState.getAnimalList().add(new Skeleton(new Point.Double(400,240)));
        AnimalState.getAnimalList().add(new Zombie(new Point.Double(2060,240)));
        AnimalState.getAnimalList().add(new Zombie(new Point.Double(300,240)));

    }
}

