package com.company.devices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device {
    public String serverAddress;
    static final String DEFAULT_SERVER_ADDRESS = "www.google.com";
    static final String DEFAULT_PROTOCOL = "https://";

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

        public void installAnApp(String appname) {
            System.out.println(appname + " installed.");
        }

        public void installAnApp(String appname, Double versionNumber) {
            System.out.println(appname + " version " + versionNumber + " installed.");
        }

        public void installAnApp(String appname, Double versionNumber, String serverAddress) {
        this.serverAddress = serverAddress;
        if(serverAddress == null){
            serverAddress = DEFAULT_PROTOCOL + DEFAULT_SERVER_ADDRESS;
            }
            System.out.println(appname + " version " + versionNumber + " installed from " + serverAddress);
        }
}
