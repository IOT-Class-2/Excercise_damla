package com.Day2;

public class Main {
    public static void main(String[] args) {
        Analyst employeeOne = new Analyst("Sally Rabert", 50000, 30); // Corrected salary value
        Salesperson employeeTwo = new Salesperson("Matt John", 650000, 37, 0.25); // Corrected commissionPercentage value

        employeeOne.getAnnoulBous();
        employeeOne.getAnnoulBous();
        employeeTwo.raiseCommission();
        employeeTwo.getCommissionPercentage();

        System.out.println(employeeOne.getSalary());
        System.out.println(employeeOne.getAnnoulBous());
        System.out.println(employeeTwo.getSalary());
        System.out.println(employeeTwo.getCommissionPercentage());
    }
}
