package com.pluralsight;

public class Dice {
    public int roll(){

       int maxValue= 6;
        int minValue= 1;

        int randomNumber = (int)(Math.random() * (maxValue - minValue + 1)) + minValue;
        return randomNumber;
    }
}
