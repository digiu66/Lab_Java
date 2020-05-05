package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

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
    }
}
