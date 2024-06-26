package com.Day2;

public class Analyst extends Employee {


    // Analyst sınıfının yapıcı metodu (constructor)
    public Analyst(String name, double salary, int age) {
        // Üst sınıf (Employee sınıfı) yapıcı metodunu çağırır
        super(name, salary, age);// kalıtım sınıfları asla return  döndürmez
    }

    // Yıllık bonus miktarını hesaplayan metot
    public double getAnnualBonus() {
        // Üst sınıftan (Employee sınıfı) salary değişkenine erişir ve %5'lik bir bonus hesaplar
        return super.salary * 0.05;
    }
}