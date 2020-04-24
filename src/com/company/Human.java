package com.company;


public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary = 3000.0;



public Double getSalary() {

    return salary;
}

public void setSalary(Double salary) {
    if(salary < 0) {
        System.out.println("Debts?");
    } else {
        System.out.println("Current salary: " + salary);
    }
}

    public Car getCar()
    {

        return car;
    }

    public void setCar(Car car) {
    if(car.value < salary) {
        this.car = car;
    } else if (this.salary > car.value/12) {
        System.out.println("Car bought on credit.");
        this.car = car;
    } else {
        System.out.println("You can't afford a car.");
    }
    }
}
