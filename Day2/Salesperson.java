package com.Day2;

public class Salesperson extends Employee {
    // Satış temsilcisinin komisyon yüzdesi
    private double commissionPercentage;

    // Salesperson sınıfının yapıcı metodu (constructor)
    public Salesperson(String name, double salary, int age, double commissionPercentage) {
        // Üst sınıf (Employee sınıfı) yapıcı metodunu çağırarak name, salary ve age değerlerini ayarlar
        super(name, salary, age);

        // Salesperson sınıfının özel (private) commissionPercentage değişkenini ayarlar
        this.commissionPercentage = commissionPercentage;
    }

    // Komisyon yüzdesini döndüren metot
    public double getCommissionPercentage() {
        return this.commissionPercentage;
    }

    // Komisyon yüzdesini artıran metot
    public void raiseCommission() {
        // Eğer mevcut komisyon yüzdesi 0.30'dan küçükse, komisyon yüzdesini %20 artırır
        if (this.commissionPercentage < 0.30) {
            this.commissionPercentage *= 1.2;
        }
    }
}