package Component.AnimalState;

import Component.Animals.Animal;
import Component.Animals.Cow;
import Game.World;
import Thing.Square;
import java.util.ArrayList;
import java.util.Random;

public class AnimalState {
    private static ArrayList<Animal> animals = new ArrayList<>();
    private static Random random = new Random(System.currentTimeMillis());
    private static double fallVelocity = 0.0;

    public static void addAnimal(Animal animal)
    {
        animals.add(animal);
    }

    public static ArrayList<Animal> getAnimalList()
    {
        return animals;
    }

    public static void updateDir()
    {
        for(int i = 0;i < animals.size();i++)
        {
            Animal animal = animals.get(i);

            int cnt = (random.nextInt(120)+1)%6;
            if(cnt == 0)
                animal.setDir(true);
            else if(cnt == 3)
                animal.setDir(false);

            //change the pic
            if(animal.getStanding())
                animal.setStanding(false);
            else if(!animal.getStanding())
                animal.setStanding(true);
        }
    }
    public static void updateAnimalLocation()
    {
        for(int i = 0;i < animals.size();i++)
        {
            Animal animal = animals.get(i);

            //determine the direction and make movement
            boolean dir = animal.getDir();
            int x = (int)animal.getLocation().x;
            int y = (int)animal.getLocation().y;
            if(World.worldSquare[x][y] == null && (animal.getLocation().y-y) > 0.01)
            {
                fallVelocity = 0.5;
                double taretY = animal.getLocation().y + fallVelocity;
                Square square = World.worldSquare[(int)animal.getLocation().x][(int)taretY];
                if(fallVelocity > 0.0 && square != null && !square.through)
                {
                    animal.setLocationy((int)taretY - 1); //avoid getting stuck in the dirt
                    fallVelocity = 0.0;
                }
                else
                {
                    animal.setLocationy(taretY);
                    if(fallVelocity <= 1)
                        fallVelocity += World.gravity;
                }
            }
            else
            {
                if(dir == true)
                {
                    double targetX = animal.getLocation().x - animal.getVelocity();
                    Square square = World.worldSquare[(int) targetX][(int) animal.getLocation().y];

                    if(square == null)
                        animal.setLocationx(targetX);
                    else if(!square.through)
                        animal.setLocationx(Math.ceil(targetX));
                    else
                        animal.setLocationx(targetX);
                }
                else if(dir == false)
                {
                    double targetX = animal.getLocation().x + animal.getVelocity();
                    Square square = World.worldSquare[(int)targetX][(int) animal.getLocation().y];

                    if(square == null)
                        animal.setLocationx(targetX);
                    else if(!square.through)
                        animal.setLocationx((int) targetX - 0.01);
                    else
                        animal.setLocationx(targetX);
                }
            }

        }
    }
}

