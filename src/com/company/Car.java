package com.company;

public class Car {
    public final String brand;
    public final String model;
    public final Integer yearOfProduction;
    public final Integer enginePower;


    public String plates;
    public Integer value = 330;


    public Car(String brand, String model, Integer yearofProduction, Integer enginePower) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearofProduction;
        this.enginePower = enginePower;
    }
}
