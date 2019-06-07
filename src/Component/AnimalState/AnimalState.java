package Component.AnimalState;

import Component.Animals.Animal;
import Component.Animals.Cow;
import Game.World;
import Thing.Square;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;

public class AnimalState {
    private static ArrayList<Animal> animals = new ArrayList<>();
    private static Random random = new Random(System.currentTimeMillis());

    static{
        animals.add(new Cow());
    }

    public static void addAnimal(Animal animal)
    {
        animals.add(animal);
    }

    public static ArrayList<Animal> getAnimalList()
    {
        return animals;
    }

    public static void updateAnimalList()
    {
        for(int i = 0;i < animals.size();i++)
        {
            Animal animal = animals.get(i);

            //determine the direction and make movement
            boolean dir = (random.nextInt(10) + 1) % 2 == 1;
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
            else
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

            if(World.worldSquare[(int)animal.getLocation().x][(int)animal.getLocation().y] == null)
            {
                double fallVelocity = 0.5;
                double taretY = animal.getLocation().y + fallVelocity;
                Square square = World.worldSquare[(int)animal.getLocation().x][(int)taretY];
                if(fallVelocity > 0.0 && square != null && !square.through)
                {
                    animal.setLocationy((int)taretY - 0.01); //avoid getting stuck in the dirt
                    fallVelocity = 0.0;
                }
                else
                {
                    animal.setLocationy(taretY);
                    if(fallVelocity <= 1)
                        fallVelocity += World.gravity;
                }
            }

            //change the pic
            if(animal.getStanding())
                animal.setStanding(false);
            else if(!animal.getStanding())
                    animal.setStanding(true);
        }
    }
}

