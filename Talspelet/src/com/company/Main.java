package com.company;
import java.util.Random;
import java.util.Scanner;
    public class Main {




        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Vilken svårighetsgrad?");
            System.out.println("1. Easy");
            System.out.println("2. Normal");
            System.out.println("3. Hard");


            int Difficulty = input.nextInt();
            if(Difficulty == 1){
                easy();
            }
            if(Difficulty == 2 ){
                normal();
            }
            if(Difficulty == 3 ){
                hard();
            }
            int Guesses = 0;
        }

        private static void hard() {
            Scanner input = new Scanner(System.in);
            System.out.println("Du har valt Hard, intervallen är 1-1000 med 50 gissningar");
            Random AnswerHard = new Random();

            int RandomNumber = AnswerHard.nextInt((1000 - 1) + 1 );
            System.out.println("Börja Gissa! Obs! skriv endast heltal ");
            for(int Guesses = 0; Guesses < 15; Guesses++){
                int Guess = input.nextInt();

                if(Guess < RandomNumber){
                    System.out.println("Din gissning är lägre än svaret");
                    System.out.println("Testa igen");


                }

                if(Guess > RandomNumber){
                    System.out.println("Din gissning är högre än svaret");
                    System.out.println("Testa igen");

                }
                if(Guess - RandomNumber == 0){
                    System.out.println("Du har vunnit");
                }
                else if(Guesses == 50) {
                    System.out.println("Du har förlorat");
                }
                }

                }



        private static void normal() {
            Scanner input = new Scanner(System.in);
            System.out.println("Du har valt normal intervallen är 1-100 med 15 gissningar");
            Random AnswerNormal = new Random();

            int RandomNumber = AnswerNormal.nextInt((100 - 1) + 1 );
            System.out.println("Börja Gissa! Obs! skriv endast heltal ");
            for(int Guesses = 0; Guesses < 10; Guesses++){
                int Guess = input.nextInt();

                if(Guess < RandomNumber){
                    System.out.println("Din gissning är lägre än svaret");
                    System.out.println("Testa igen");


                }
                if(Guess > RandomNumber){
                    System.out.println("Din gissning är högre än svaret");
                    System.out.println("Testa igen");


                }
                if(Guess - RandomNumber == 0){
                    System.out.println("Du har vunnit");
                }
                else if(Guesses == 15) {
                    System.out.println("Du har förlorat");
                }

                }
            }


        private static void easy() {
            Scanner input = new Scanner(System.in);
            System.out.println("Du har valt Easy, intervallen är 1-10 med 5 gissningar");
            Random AnswerEasy = new Random();
            int RandomNumber = AnswerEasy.nextInt((10 - 1) + 1);
            System.out.println("Börja Gissa! Obs! skriv endast heltal ");
            for(int Guesses = 0; Guesses < 5; Guesses++){
                int Guess = input.nextInt();

                if(Guess < RandomNumber){
                    System.out.println("Din gissning är lägre än svaret");
                    System.out.println("Testa igen");

                }
                if(Guess > RandomNumber){
                    System.out.println("Din gissning är högre än svaret");
                    System.out.println("Testa igen");

                }
                if(Guess - RandomNumber == 0){
                    System.out.println("Du har vunnit");

                }
                else if(Guesses == 5) {
                    System.out.println("Du har förlorat");
                }

                }
            }

        }







