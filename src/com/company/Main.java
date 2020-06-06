package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.util.Date;
import java.util.List;

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
        Human brother = new Human();
        brother.firstName = "Bambo";
        brother.lastName = "Bimbo";


        myself.pet = dog;
        myself.pet.feed();
        myself.pet.takeForAWalk();

        Car batmobile = new LPG("Batmobile", "Tumbler", 2005, 1000, "black");
        Car tank = new Diesel("Tiger", "II", 1943, 20000, "green");
        Car tesla1 = new Electric("Tesla", "X", 2019, 100, "red");
        Car tesla2 = new Electric("Tesla", "S", 2019, 120, "yellow");
        Car tesla3 = new Electric("Tesla", "3", 2019, 130, "white");

        Phone samsung = new Phone("samsung", "galaxy s1500", 2022);

        myself.setGarage();
        neighbor.setGarage();
        myself.setCar(batmobile, 0);
        myself.setCar(tank, 1);
        myself.setCar(tesla1, 2);
        myself.setCar(tesla2, 3);
        myself.setCar(tesla3, 4);
        myself.setPhone(samsung);

        System.out.println("My garage: " + myself.garage);

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

        Car.sell(myself, neighbor, 9000.0, 0);
        samsung.sell(myself, neighbor, 2000.0);
        System.out.println(neighbor.cash);

        Animal cat = new Pet("cat");
        cat.name = "Death";
        System.out.println("I'm a cat named " + cat.name + " and I weigh " + cat.weight);

        Animal cow = new FarmAnimal("cow");
        cow.name = "Milka";
        System.out.println(cow.name + " is my name, mooo.");

        cow.feed(4.0);


        samsung.installAnApp("Instagram");
        samsung.installAnApp("Facebook", 1.32);
        samsung.installAnApp("G-Drive", 1.6, null);

        batmobile.refuel();

        System.out.println(myself.getCar(1));
        System.out.println(myself.getCar(2));

        System.out.println(batmobile.ownerList);

        System.out.println(batmobile.owner.firstName + ' ' + batmobile.owner.lastName);

        Car.sell(myself, neighbor, 0000.0, 1);
        System.out.println("I gave it to you for free, you poor bastard. But I got two more so whatever.");
    }
}
