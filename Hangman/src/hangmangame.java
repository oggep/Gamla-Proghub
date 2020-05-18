import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class hangmangame {
    private static int menu = 0;
    private static String[] shortwords = {"car", "foot", "rain", "sand", "cow", "shoe", "dirt"};
    private static String[] mediumwords = {"forest", "bottle", "teeth", "bored", "forced", "knife"};
    private static String[] longwords = {"skydiving", "Communicate", "friendzone", "vandalize", "Football", "advanced"};
    private static String word;
    private static char[] chararray;
    private static ArrayList<String> hangmananimation = setUpHangman();
    private static Scanner input = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {
        word = "";
        startMenu();
        while (true) {
            System.out.println("");
            System.out.println("You lost!");
            System.out.println("");
            System.out.println("Do you want to play again?");
            System.out.println("Press 1 if you want to play again.");
            int playagain = input.nextInt();
            input.nextLine();
            if (playagain != 1) {
                break;
            }
            startMenu();
        }
        System.out.println("Goodbye!");
    }

    public static void startMenu() {

        System.out.println("Welcome to Hangman");
        System.out.println("What length of words do you want?");
        System.out.println("1. Short");
        System.out.println("2. Medium");
        System.out.println("3. Long");
        System.out.println("Only numbers!");
        menu = input.nextInt();
        input.nextLine();
        if (menu > 3) {
            System.out.println("This difficulty doesn't exist. Automaticly switching you to short words.");
            menu = 1;
        }
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
        word = shortwords[rand.nextInt(shortwords.length)];
        chararray = new char[word.length()];
        for (int i = 0; i < chararray.length; i++) {
            chararray[i] = '_';
        }
        checkLetter();
    }

    private static void mediumWord() {
        word = mediumwords[rand.nextInt(mediumwords.length)];
        chararray = new char[word.length()];
        for (int i = 0; i < chararray.length; i++) {
            chararray[i] = '_';
        }
        checkLetter();
    }

    private static void longWord() {
        word = longwords[rand.nextInt(longwords.length)];
        chararray = new char[word.length()];
        for (int i = 0; i < chararray.length; i++) {
            chararray[i] = '_';
        }
        checkLetter();
    }

    public static void checkLetter() {
        for (int tries = 1; tries <= 7; tries++) {
            System.out.println("Choose a letter!");
            char letter = input.nextLine().toLowerCase().charAt(0);
            if (tries == 0) {
                tries++;
            }
            if (Character.isLetter(letter)) {
                if (word.contains(letter + "")) {
                    for (int j = 0; j < chararray.length; j++) {
                        if (word.charAt(j) == letter) {
                            chararray[j] = letter;
                            tries--;
                            for (int i = 0; i < chararray.length; i++) {
                                if (chararray[i] == '_') ;
                                {
                                    boolean won = false;
                                }

                            }
                        }
                    }
                } else {
                    System.out.println(hangmananimation.get(tries - 1));
                    System.out.println(7 - tries + " Wrong Guesses left");
                }
                System.out.println(chararray);
            }


        }


        private static ArrayList<String> setUpHangman(){
            ArrayList<String> returnvalue = new ArrayList<>();
            returnvalue.add("  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========''', '''");
            returnvalue.add("  +---+\n" +
                    "  |   |\n" +
                    "  o   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========''', '''");
            returnvalue.add("  +---+\n" +
                    "  |   |\n" +
                    "  o   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========''', '''");
            returnvalue.add("  +---+\n" +
                    "  |   |\n" +
                    "  o   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========''', '''");
            returnvalue.add("  +---+\n" +
                    "  |   |\n" +
                    "  o   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========''', '''");
            returnvalue.add(" +---+\n" +
                    "  |   |\n" +
                    "  o   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========''', '''");
            returnvalue.add("  +---+\n" +
                    "  |   |\n" +
                    "  o   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "=========''']");
            return returnvalue;
        }

    }
}
