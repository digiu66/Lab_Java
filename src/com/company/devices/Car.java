package com.company.devices;

public class Car {
    public final String brand;
    public final String model;
    public final Integer yearOfProduction;
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


    public String toString() {
        return brand + " " + model + " " + yearOfProduction + " " + enginePower + " " + color + " " + value;
    }
}