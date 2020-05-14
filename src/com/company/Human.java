package com.company;


import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    public Car car;
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

    public Car getCar() {

        return car;
    }

    public Phone getPhone() {

        return phone;
    }

    public void setCar(Car car) {
        if (car.value < salary) {
            this.car = car;
        } else if (this.salary > car.value / 12) {
            System.out.println("Car bought on credit.");
            this.car = car;
        } else {
            System.out.println("You can't afford a car.");
        }
    }

    public void setPhone(Phone phone) {

        this.phone = phone;
    }

    public String toString() {
        return firstName + " " + lastName + " " + pet + " " + car;
    }
}