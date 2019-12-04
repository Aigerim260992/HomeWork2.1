package com.company;

import java.util.SplittableRandom;

public class Reptiles extends Animal {
    private String view;


    public Reptiles(Mainland mainland, String country, String view) {
        super(mainland, country);
        this.view = view;
    }

     String getView() {

        return view;
    }

   final void makeVoice(String voice){
       System.out.println(voice);

   }

   void makeVoice (int number){
       for (int i = 0; i < number; i++) {
           System.out.println();

       }
   }





}

