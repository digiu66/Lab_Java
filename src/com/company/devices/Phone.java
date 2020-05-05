package com.company.devices;

public class Phone extends Device {

    public Phone(String brand, String model, Integer yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

        public void turnOn () {
            super.turnOn();
            System.out.println("Your phone is up and running, ring ring.");
        }


        public String toString () {
            return brand + " " + model + " " + yearOfProduction;
        }
    }
