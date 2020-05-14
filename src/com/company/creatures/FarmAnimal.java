package com.company.creatures;

public class FarmAnimal extends Animal implements Edible{
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {

    }

    @Override
    public void feed(Double foodWeight) {
        if (weight > 0) {
            this.weight = weight + foodWeight;
            System.out.println("After eating " + foodWeight + " kilos of food I weigh " + weight);
        }
    }
}
