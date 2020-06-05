package com.company.devices;

import com.company.Human;
import com.company.sellable;

public class Device implements sellable {
    public String brand;
    public String model;
    public Integer yearOfProduction;


    public String toString() {
        return brand + ' ' + model + ' ' + yearOfProduction;
    }

    public void turnOn() {
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) {
            if(seller.phone != null && buyer.cash >= price) {
            seller.cash = seller.cash + price;
            buyer.cash = buyer.cash - price;
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println(buyer.firstName + " " + buyer.lastName + " is now the owner of " + buyer.phone);
        } else {
            System.out.println("Piaseczny has no more money.");
        }
    }
}