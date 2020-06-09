package com.company.devices;


import java.util.ArrayList;

public class Application {
    public String appname;
    public Double price;
    public String ver;
    public static ArrayList<Application> appstore = new ArrayList<Application>(4);


    public Application(String appname, Double price, String ver) {
        this.appname = appname;
        this.price = price;
        this.ver = ver;
        appstore.add(this);
    }


}
