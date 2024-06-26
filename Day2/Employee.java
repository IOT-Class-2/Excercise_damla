package com.Day2;

public class Employee {
    // İşçinin adı
    private String name;

    // İşçinin maaşı
    protected double salary;

    // İşçinin yaşı
    private int age;

    // Employee sınıfının yapıcı metodu (constructor)
    public Employee(String name, double salary, int age) {
        // Parametre olarak verilen ismi sınıfın name değişkenine atar
        this.name = name;

        // Parametre olarak verilen maaşı sınıfın salary değişkenine atar
        this.salary = salary;

        // Parametre olarak verilen yaş bilgisini sınıfın age değişkenine atar
        this.age = age;
    }

    // İşçinin adını döndüren metot
    public String getName() {
        return this.name;
    }

    // İşçinin yaşını döndüren metot
    public int getAge() {
        return this.age;
    }

    // İşçinin maaşını döndüren metot
    public double getSalary() {
        return this.salary;
    }

    // İşçinin maaşına zam yapmak için kullanılan metot
    public void raiseSalary(double raiseAmount) {
        // Verilen raiseAmount kadar maaşa zam yapar
        this.salary += raiseAmount;
    }
}