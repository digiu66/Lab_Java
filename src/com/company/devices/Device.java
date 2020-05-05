package com.company.devices;

abstract class Device {
    public String brand;
    public String model;
    public Integer yearOfProduction;


    public String toString() {
        return brand + ' ' + model + ' ' + yearOfProduction;
    }

    public void turnOn() {
    }


}
