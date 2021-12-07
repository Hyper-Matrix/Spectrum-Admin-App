package com.example.spectrumadmin;

public class User {

    private String name;
    private String purpose;
    private double weight;


    public User(){}
    public User(String n, String c, double w){
        this.name=n;
        this.purpose=c;
        this.weight=w;

    }
    public String getName() {
        return name;
    }

    public String getPurpose() {
        return purpose;
    }

    public double getWeight() {
        return weight;
    }



    @Override
    public String toString() {
        return name +" "+ purpose +" " +weight;
    }
}

