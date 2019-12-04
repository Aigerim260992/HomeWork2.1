package com.company;

public final class Crocodile extends Reptiles{


    private String gender;
    private int age;
    private int weight;

    public Crocodile(Mainland mainland, String country, String view, String gender, int age, int weight) {
        super(mainland, country, view);
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Пол: " + getGender() +", Возраст:" + getAge() +" , Вес:" + getWeight() ;
    }
}