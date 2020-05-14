package com.company.creatures;

import com.company.Human;
import com.company.sellable;

public abstract class Animal implements sellable, Feedable {
    public String name;
    final String species;
    public Double weight;

    static final Double DEFAULT_DOG_WEIGHT = 5.0; //small dogs are cooler I guess
    static final Double DEFAULT_CAT_WEIGHT = 3.0;
    static final Double DEFAULT_COW_WEIGHT = 500.0;

    public Animal(String species) {
        this.species = species;
        if (species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species == "cat") {
            this.weight = DEFAULT_CAT_WEIGHT;
        } else if (species == "cow") {
            this.weight = DEFAULT_COW_WEIGHT;
        }
    }

    public void feed() {
        if (weight > 0) {
            weight++;
            System.out.println("I weigh " + weight);
        }

        else {
            System.out.println("I'm dead and I can't eat no more.");
        }
    }

    public void takeForAWalk() {
        weight--;
        if (weight <= 0) {
            System.out.println("I'm dead and I can't walk no more");
        }
        else {
            System.out.println("I like walking with you.");
        }
    }

    public String toString() {
        return name + " " + species + " " + weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.pet != null && buyer.cash >= price) {
            seller.cash = seller.cash + price;
            buyer.cash = buyer.cash - price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println(buyer.firstName + " " + buyer.lastName + " is now the owner of " + buyer.pet.name);
        }
    }
}
