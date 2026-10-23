package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {

        Dice dice = new Dice();

        int roll1;
        int roll2;



        int roll2Count = 0;
        int roll4Count = 0;
        int roll6Count = 0;
        int roll7Count = 0;



        for(int i = 1; i <= 100; i++) {

             roll1 = dice.roll();
             roll2 = dice.roll();

            int rollTotal = roll1 + roll2;

            if (rollTotal == 2) {
                roll2Count += 1;
            }else if(rollTotal == 4){
                roll4Count += 1;

            }else if(rollTotal == 6){
                roll6Count += 1;

            }else if(rollTotal == 7){
                roll7Count += 1;

            }

            System.out.println("Roll " + i + ": "+ roll1 + " - " + roll2 + " Sum: " + rollTotal);




        }

        System.out.println("Roll 2 count: " + roll2Count);
        System.out.println("Roll 4 count: " + roll4Count);
        System.out.println("Roll 6 count: " + roll6Count);
        System.out.println("Roll 7 count: " + roll7Count);




    }
}
