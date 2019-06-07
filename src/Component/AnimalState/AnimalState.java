package Component.AnimalState;

import Component.Animals.Animal;

import java.util.ArrayList;

public class AnimalState {
    private ArrayList<Animal> animals = null;

    public void addAnimal(Animal animal)
    {
        animals.add(animal);
    }

    public Animal getAnimal(int i)
    {
        return animals.get(i);
    }
}
