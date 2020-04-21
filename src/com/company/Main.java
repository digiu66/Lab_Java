package com.company;

public class Main {

    public static void main(String [] args) {

        Animal dog = new Animal("dog");
        dog.name = "Luska";


        Human myself = new Human();
        myself.firstName = "Igor";
        myself.lastName = "Banach";


        myself.pet = dog;
        myself.pet.feed();
        myself.pet.takeForAWalk();
    }
}
