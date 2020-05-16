package com.company.devices;

public class Diesel extends Car {
    public Diesel(String brand, String model, Integer yearofProduction, Integer enginePower, String color) {
        super(brand, model, yearofProduction, enginePower, color);
    }

    @Override
    public void refuel() {
    }
}
