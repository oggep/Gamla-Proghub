import java.util.Scanner;
import java.util.Random;

public class hangmangame {
    private static int menu = 0;
    private static String[] shortwords = {"car", "foot", "rain", "sand", "cow", "shoe", "dirt"};
    private static String[] mediumwords = {"forest", "bottle", "teeth", "bored", "forced", "knife"};
    private static String[] longwords = {"skydiving", "Communicate", "friendzone", "vandalize", "Football", "advanced"};
    private static String word;
    private static char doeslettermatch;
    private static char[] chararray;






    public static void main(String[] args) {
        word = "";
        startMenu();
    }

    public static void startMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Hangman");
        System.out.println("What length of words do you want?");
        System.out.println("1. Short");
        System.out.println("2. Medium");
        System.out.println("3. Long");
        menu = input.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Redirecting you to short words...");
                shortWord();
                break;
            case 2:
                System.out.println("Redirecting you to medium words...");
                mediumWord();
                break;
            case 3:
                System.out.println("Redirecting you to long words...");
                longWord();
                break;
        }
    }

    private static void shortWord() {
        Random rand = new Random();
        word = shortwords[rand.nextInt(shortwords.length)];
        chararray = new char[word.length()];
        for (int i = 0; i < chararray.length; i++) {
            chararray[i] = '_';}
        checkLetter();
    }

    private static void mediumWord() {
        Random rand = new Random();
        word = mediumwords[rand.nextInt(mediumwords.length)];
        chararray = new char[word.length()];
        for (int i = 0; i < chararray.length; i++) {
            chararray[i] = '_';}
        checkLetter();
    }

    private static void longWord() {
        Random rand = new Random();
        word = longwords[rand.nextInt(longwords.length)];
        chararray = new char[word.length()];
        for(int i = 0; i < chararray.length; i++) {
            chararray[i] = '_';}
        checkLetter(char[] chararray);
    }

    public static void checkLetter(char chararray1) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a letter!");
        System.out.println(chararray1);



        System.out.println(word);

        char letter = input.next().toLowerCase().charAt(0);
            for(int j = 0; j < chararray.length; j++) {
            if (word.charAt(j) == letter) {
                chararray[j] = letter;
            }

        }




               }
        }
    }






