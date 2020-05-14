package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Main {

    public static void main(String [] args){

        Animal dog = new Pet("dog");
        dog.name = "Luska";


        Human myself = new Human();
        myself.firstName = "Igor";
        myself.lastName = "Banach";
        Human neighbor = new Human();
        neighbor.firstName = "Andrzej";
        neighbor.lastName = "Piaseczny";


        myself.pet = dog;
        myself.pet.feed();
        myself.pet.takeForAWalk();

        Car batmobile = new Car("Batmobile", "Tumbler", 2005, 1000, "black");

        Phone samsung = new Phone("samsung", "galaxy s1500", 2022);

        myself.setCar(batmobile);
        myself.setPhone(samsung);

        System.out.println("My car: " + myself.getCar());

        Date date = new Date(System.currentTimeMillis());


        myself.setSalary(1878.0);

        System.out.println("Today is: " + date + "\nPayday: " + myself.getSalary());
        System.out.println("New info sent to our accountants.");
        System.out.println("You need to get the annex from Pani Hania.");
        System.out.println("ZUS knows. FBI open up!");


        System.out.println(myself);
        System.out.println(batmobile);
        System.out.println(dog);


        batmobile.turnOn();
        samsung.turnOn();

        dog.sell(myself, neighbor, 1000.0);
        System.out.println("My pet: " + myself.pet);
        System.out.println("My neighbor's pet: " + neighbor.pet);
        System.out.println("My cash: " + myself.cash);
        System.out.println("Andrzej's cash: " + neighbor.cash);

        batmobile.sell(myself, neighbor, 9000.0);
        samsung.sell(myself, neighbor, 2000.0);
        System.out.println(neighbor.cash);

        Animal cat = new Pet("cat");
        cat.name = "Death";
        System.out.println("I'm a cat named " + cat.name + " and I weigh " + cat.weight);

        Animal cow = new FarmAnimal("cow");
        cow.name = "Milka";
        System.out.println(cow.name + " is my name, mooo.");

        cow.feed(4.0);

    }
}
