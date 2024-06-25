package com.Day2;

public class Analyst extends Employee{

    public Analyst(String name, double salary, int age){
     super (name,salary,age);
        }
        public double getAnnoulBous(){
        return super.salary*.05;
        }
    }
