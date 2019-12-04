package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Reptiles rep1 = new Reptiles(Mainland.AFRICA, "Morocco", "Nile Crocodile" );
        Crocodile crocodile1 = new Crocodile(Mainland.AUSTRALIA, "Australia", "Comb crocodile", "Male", 5, 180);
        Crocodile crocodile2 = new Crocodile(Mainland.SOUTH_AMERICA, "Mexico", "Wild crocodile", "Female", 7, 400 );



        System.out.println(rep1. getInfo());
        System.out.println(crocodile1.getInfo());
        System.out.println(crocodile2.getInfo());

        rep1.makeVoice("Pppp");
        rep1.makeVoice(4);









    }
}
