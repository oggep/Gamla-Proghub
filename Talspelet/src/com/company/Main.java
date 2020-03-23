package com.company;
import java.util.Random;
import java.util.Scanner;
    public class Main {


        //dessa 5 raderna är för att main metod, för input, de andra är output för meny
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Vilken svårighetsgrad?");
            System.out.println("1. Easy");
            System.out.println("2. Normal");
            System.out.println("3. Hard");

            //här väljer du vilken svårighetsgrad
            int Difficulty = input.nextInt();

            //Här är där inputen väljer vilken metod man hamnar i.
            if(Difficulty == 1){
                easy();
            }
            if(Difficulty == 2 ){
                normal();
            }
            if(Difficulty == 3 ){
                hard();
            }
            //Detta är ett felsystem så att man inte ska skriva högre än 3
            if(Difficulty < 3){
                System.out.println("Detta alternativet finns inte");
            }
        }
        //min metod för svårighetsgraden hard
        private static void hard() {
            //här är min scanner till metoden
            Scanner input = new Scanner(System.in);
            //förklarar om nivån
            System.out.println("Du har valt Hard, intervallen är 1-1000 med 15 gissningar");
            //här är min randomizer
            Random AnswerHard = new Random();
            //Denna väjer intervallet de slumpade talet kan ha
            int RandomNumber = AnswerHard.nextInt((1000 - 1) + 1 );
            //säkerhetsmeddelande
            System.out.println("Börja Gissa! Obs! skriv endast heltal ");
            //forloop för att kunna gissa under rätt antal gånger
            for(int Guesses = 0; Guesses < 15; Guesses++){
                //inputen för att kunna gissa
                int Guess = input.nextInt();
                //om talet är lägre så hamnar man här för att få den infon
                if(Guess < RandomNumber){
                    System.out.println("Din gissning är lägre än svaret");
                    System.out.println("Testa igen");


                }
                //om talet är högre så hamnar man här för att få den infon
                if(Guess > RandomNumber){
                    System.out.println("Din gissning är högre än svaret");
                    System.out.println("Testa igen");

                }
                //här hamnar man om man har vunnit
                if(Guess - RandomNumber == 0){
                    System.out.println("Du har vunnit");
                }
                //här hamnar man om man har gissat för mycket.
                else if(Guesses == 50) {
                    System.out.println("Du har förlorat");
                }
                }

                }


        //min metod för svårighetsgraden Normal
        private static void normal() {
            //här är min scanner till metoden
            Scanner input = new Scanner(System.in);
            //förklarar om nivån
            System.out.println("Du har valt normal intervallen är 1-100 med 10 gissningar");
            //här är min randomizer
            Random AnswerNormal = new Random();
            //Denna väjer intervallet de slumpade talet kan ha
            int RandomNumber = AnswerNormal.nextInt((100 - 1) + 1 );
            //säkerhetsmeddelande
            System.out.println("Börja Gissa! Obs! skriv endast heltal ");
            //forloop för att kunna gissa under rätt antal gånge
            for(int Guesses = 0; Guesses < 10; Guesses++){
                //inputen för att kunna gissa
                int Guess = input.nextInt();
                //om talet är lägre så hamnar man här för att få den infon
                if(Guess < RandomNumber){
                    System.out.println("Din gissning är lägre än svaret");
                    System.out.println("Testa igen");


                }
                //om talet är högre så hamnar man här för att få den infon
                if(Guess > RandomNumber){
                    System.out.println("Din gissning är högre än svaret");
                    System.out.println("Testa igen");


                }
                //här hamnar man om man har vunnit
                if(Guess - RandomNumber == 0){
                    System.out.println("Du har vunnit");
                }
                //här hamnar man om man har gissat för mycket.
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







