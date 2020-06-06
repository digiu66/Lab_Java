package com.company.devices;

import com.company.Human;

import java.util.ArrayList;

public abstract class Car extends Device {
    public static Human owner;
    public final Integer enginePower;
    public String color;
    public Integer value = 10000;
    public static ArrayList<String> ownerList = new ArrayList<String>();
    public static Integer transactionCounter = 0;


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

    public static void setOwner(Human owner) {
        Car.owner = owner;
        ownerList.add(owner.firstName + ' ' + owner.lastName);
    }

    public static void sell(Human seller, Human buyer, Double price, Integer parkingSpace) {
        if (seller.garage != null && buyer.cash >= price) {
            seller.garage.get(parkingSpace).setOwner(seller);
            seller.cash = seller.cash + price;
            buyer.cash = buyer.cash - price;
            buyer.garage.add(seller.garage.get(parkingSpace));
            seller.garage.remove(seller.garage.get(parkingSpace));
            buyer.garage.get(parkingSpace).setOwner(buyer);
            System.out.println(buyer.firstName + " " + buyer.lastName + " is now the owner of " + buyer.garage.get(parkingSpace));
            System.out.println("Transaction successful, your garages: ");
            System.out.println("Seller: " + seller.garage);
            System.out.println("Buyer: " + buyer.garage);
            System.out.println("Total transactions: ");
            System.out.println(Car.transactionCounter++);
        } else {
            System.out.println("Transaction failed.");
        }
    }

    public String toString() {
        return brand + " " + model + " " + yearOfProduction + " " + enginePower + " " + color + " " + value;
    }
}