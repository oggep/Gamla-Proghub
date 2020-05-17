import java.util.ArrayList;
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
    private static int wrongguesses = 0;
    private static ArrayList<String> hangmananimation = setuphangman();

    private static ArrayList<String> setuphangman() {

    }


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
            chararray[i] = '_';
        }
        checkLetter();
    }

    private static void mediumWord() {
        Random rand = new Random();
        word = mediumwords[rand.nextInt(mediumwords.length)];
        chararray = new char[word.length()];
        for (int i = 0; i < chararray.length; i++) {
            chararray[i] = '_';
        }
        checkLetter();
    }

    private static void longWord() {
        Random rand = new Random();
        word = longwords[rand.nextInt(longwords.length)];
        chararray = new char[word.length()];
        for (int i = 0; i < chararray.length; i++) {
            chararray[i] = '_';
        }
        checkLetter();
    }

    public static void checkLetter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a letter!");
        System.out.println(chararray);
        System.out.println(word);
        for (int tries = 0; tries >= 6; tries++) {
            char letter = input.nextLine().toLowerCase().charAt(0);
            if(Character.isLetter(letter)){
                boolean correctletter = false;
                for (int j = 0; j >= chararray.length; j++) {
                    if (word.charAt(j) == letter) {
                        chararray[j] = letter;
                        System.out.println(chararray);
                        tries--;
                    }
                    else if (j == chararray.length){
                        wrongguesses++;
                        hangman();}
                }
            }
            else{
                tries--;
            }
            }

        }


    public static void hangman() {
        switch (wrongguesses) {
            case 1:
                System.out.print("  +---+\n" +
                        "  |   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========''', '''");
                System.out.println("6 guesses left");
                checkLetter();
                break;
            case 2:
                System.out.print("  +---+\n" +
                        "  |   |\n" +
                        "  o   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========''', '''");
                System.out.println("5 guesses left");
                checkLetter();
                break;
            case 3:
                System.out.print("  +---+\n" +
                        "  |   |\n" +
                        "  o   |\n" +
                        "  |   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========''', '''");
                System.out.println("4 guesses left");
                checkLetter();
                break;
            case 4:
                System.out.print("  +---+\n" +
                        "  |   |\n" +
                        "  o   |\n" +
                        " /|   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========''', '''");
                System.out.println("3 guesses left");
                checkLetter();
                break;
            case 5:
                System.out.print("  +---+\n" +
                        "  |   |\n" +
                        "  o   |\n" +
                        " /|\\  |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========''', '''");
                System.out.println("2 guesses left");
                checkLetter();
                break;
            case 6:
                System.out.print(" +---+\n" +
                        "  |   |\n" +
                        "  o   |\n" +
                        " /|\\  |\n" +
                        " /    |\n" +
                        "      |\n" +
                        "=========''', '''");
                System.out.println("1 guesses left");
                checkLetter();
                break;
            case 7:
                System.out.print("  +---+\n" +
                        "  |   |\n" +
                        "  o   |\n" +
                        " /|\\  |\n" +
                        " / \\  |\n" +
                        "      |\n" +
                        "=========''']");
                System.out.println("Game over you lost.");
                System.out.println("The word was:" + " " + word);
                break;

        }


    }
}