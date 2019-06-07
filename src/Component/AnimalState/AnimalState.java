package Component.AnimalState;

import Component.Animals.Animal;
import Component.Animals.Cow;

import java.util.ArrayList;

public class AnimalState {
    private static ArrayList<Animal> animals = new ArrayList<>();
    static{
        animals.add(new Cow());
    }

    public void addAnimal(Animal animal)
    {
        animals.add(animal);
    }

    public static ArrayList<Animal> getAnimalList()
    {
        return animals;
    }
}
