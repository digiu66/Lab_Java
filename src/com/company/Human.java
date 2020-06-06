package com.company;


import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;
import java.util.ArrayList;

public class Human {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    public Integer capacity = 5;
    public ArrayList<Car> garage = new ArrayList<Car>(capacity);
    private Double salary = 3000.0;
    public Double cash = 10000.0;



    public Double getSalary() {

        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Debts?");
        } else {
            System.out.println("Current salary: " + salary);
        }
    }

    public Car getCar(Integer parkingSpace) {
        return garage.get(parkingSpace);
    }

    public Phone getPhone() {

        return phone;
    }

    public void setCar(Car car, Integer parkingSpace) {
        if (car.value < salary) {
            garage.add(parkingSpace, car);
        } else if (this.salary > car.value / 12) {
            System.out.println(car.brand + " bought on credit.");
            garage.add(parkingSpace, car);
        } else {
            System.out.println("You can't afford a car.");
        }
    }

    public void setPhone(Phone phone) {

        this.phone = phone;
    }

    public void setGarage() {
        this.garage = new ArrayList<Car>(capacity);
        System.out.println("Your garage now has " + capacity + " parking spaces.");
    }

    public String toString() {
        return firstName + " " + lastName + " " + pet + " " + garage;
    }
}