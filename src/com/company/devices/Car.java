package com.company.devices;

import com.company.Human;

public abstract class Car extends Device {
    public final Integer enginePower;
    public String color;
    public Integer value = 10000;


    public Car(String brand, String model, Integer yearofProduction, Integer enginePower, String color) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearofProduction;
        this.enginePower = enginePower;
        this.color = color;
    }


    public void turnOn() {
        super.turnOn();
        System.out.println("Your car is up and running, vroom vroom.");
        }

     public abstract void refuel();

    public static void sell(Human seller, Human buyer, Double price, Integer parkingSpace) {
        if (seller.garage != null && buyer.cash >= price) {
            seller.cash = seller.cash + price;
            buyer.cash = buyer.cash - price;
            buyer.garage.add(seller.garage.get(parkingSpace));
            seller.garage.remove(seller.garage.get(parkingSpace));
            System.out.println(buyer.firstName + " " + buyer.lastName + " is now the owner of " + buyer.garage.get(parkingSpace));
            System.out.println("Transaction successful, your garages: ");
            System.out.println("You: " + seller.garage);
            System.out.println("Piaseczny: " + buyer.garage);
        } else {
            System.out.println("Transaction failed.");
        }
    }

    public String toString() {
        return brand + " " + model + " " + yearOfProduction + " " + enginePower + " " + color + " " + value;
    }
}