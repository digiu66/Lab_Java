package com.company.devices;


import com.company.Human;

import java.util.ArrayList;
import java.util.Arrays;

public class Phone extends Device {
    public String serverAddress;
    static final String DEFAULT_SERVER_ADDRESS = "www.google.com";
    static final String DEFAULT_PROTOCOL = "https://";
    public ArrayList<Application> installedApps = new ArrayList<>(4);

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

        public void installAnApp2(Human buyer, Application application) {
        if (buyer.cash >= application.price) {
                installedApps.add(application);
                buyer.cash = buyer.cash - application.price;
            System.out.println("Successfully installed an app from appstore." + application.toString());
            }
        else {
            System.out.println("Installation failed.");
        }
        }

    Application facebook = new Application("facebook", 0.0, "2.0");
    Application game = new Application("Microtransactions", 19.99, "0.4");
    Application camera = new Application("Super Cam", 15.00, "1.2");
    Application funnyfaces = new Application("Funny Faces", 3.99, "1.1");


    public boolean installed(Application application) {
        if(Arrays.asList(installedApps).contains(application)) {
            return true;
        } else {
            return false;
        }
    }
}
