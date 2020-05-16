package com.company.devices;

public class LPG extends Car {
    public LPG(String brand, String model, Integer yearofProduction, Integer enginePower, String color) {
        super(brand, model, yearofProduction, enginePower, color);
    }

    @Override
    public void refuel() {
        System.out.println("You refueled your car with LPG. At least it's cheap.");
    }
}