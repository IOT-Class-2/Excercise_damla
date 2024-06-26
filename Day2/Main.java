package com.Day2;

public class Main {
    public static void main(String[] args) {
        // Analyst sınıfından bir employeeOne nesnesi oluşturulur
        Analyst employeeOne = new Analyst("Sally Rabert", 50000, 30); // Doğru maaş değeri düzeltildi

        // Salesperson sınıfından bir employeeTwo nesnesi oluşturulur
        Salesperson employeeTwo = new Salesperson("Matt John", 650000, 37, 0.25); // Doğru commissionPercentage değeri düzeltildi

        // employeeOne nesnesinin yıllık bonusunu hesaplayan metot çağrılır
        employeeOne.getAnnualBonus();

        // employeeOne nesnesinin yıllık bonusunu hesaplayan metot tekrar çağrılır (sonucu kullanılmaz)
        employeeOne.getAnnualBonus();

        // employeeTwo nesnesinin komisyon oranını artıran metot çağrılır
        employeeTwo.raiseCommission();

        // employeeTwo nesnesinin komisyon oranını döndüren metot çağrılır
        employeeTwo.getCommissionPercentage();

        // employeeOne nesnesinin maaşı ekrana yazdırılır
        System.out.println(employeeOne.getSalary());

        // employeeOne nesnesinin yıllık bonusu ekrana yazdırılır
        System.out.println(employeeOne.getAnnualBonus());

        // employeeTwo nesnesinin maaşı ekrana yazdırılır
        System.out.println(employeeTwo.getSalary());

        // employeeTwo nesnesinin komisyon yüzdesi ekrana yazdırılır
        System.out.println(employeeTwo.getCommissionPercentage());
    }
}
