package com.Day2;

public class Salesperson extends Employee {
    private double commissionPercentage;

    public Salesperson(String name, double salary, int age, double commissionPercentage) {
        super(name, salary, age);
        this.commissionPercentage = commissionPercentage;
    }
    public double getCommissionPercentage() {
        return this.commissionPercentage;
    }
    public void raiseCommission() {
        if (this.commissionPercentage < 0.30) {
            this.commissionPercentage *= 1.2;
        }
    }
}
