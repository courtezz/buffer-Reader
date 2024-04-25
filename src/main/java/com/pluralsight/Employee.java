package com.pluralsight;

import java.io.FileWriter;
import java.io.Writer;

public class Employee {



        private int id;
        private String name;
        private double hoursWorked;
        private double payRate;

        public Employee(int id, String name, double hoursWorked, double payRate) {
            this.id = id;
            this.name = name;
            this.hoursWorked = hoursWorked;
            this.payRate = payRate;

        }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double calculatePay() {
        return hoursWorked * payRate;


    }

    public static void main(String[] args) {

    }
    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nHours Worked: " + hoursWorked + "\nPay Rate: $" + payRate + " per hour";

    }

}

