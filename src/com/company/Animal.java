package com.company;

public class Animal {

    private Mainland mainland;
    private String country;


    public Animal(Mainland mainland, String country) {
        this.mainland = mainland;
        this.country = country;
    }

    public Mainland getMainland() {
        return mainland;
    }

    public String getCountry() {
        return country;
    }

   public String getInfo(){
        return "Материк: " + getMainland() +", Страна:" + getCountry();
   }
}
