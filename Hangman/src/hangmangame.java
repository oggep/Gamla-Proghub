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
    }

    public static void playAgainOrEnd(){
        while (true) {
            System.out.println("");
            System.out.println("Do you want to play again?");
            System.out.println("Press 1 if you want to play again, press any key expect 1 don't want to play again.");
            int playagain = getValidIntegerInput();
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
        while (true) {
            menu = getValidIntegerInput();
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
                default:
                    System.out.println("you need to put a number between 1-3");
                    continue;
            }
        }
    }

    private static void shortWord() {
        word = "";
        word = shortwords[rand.nextInt(shortwords.length)];
        chararray = new char[word.length()];
        for (int i = 0; i < chararray.length; i++) {
            chararray[i] = '_';
        }
        checkLetter();
    }

    private static void mediumWord() {
        word = "";
        word = mediumwords[rand.nextInt(mediumwords.length)];
        chararray = new char[word.length()];
        for (int i = 0; i < chararray.length; i++) {
            chararray[i] = '_';
        }
        checkLetter();
    }

    private static void longWord() {
        word = "";
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
                            System.out.println(chararray);
                            tries--;
                        }
                    }
                } else {
                    System.out.println(hangmananimation.get(tries - 1));
                    System.out.println(7 - tries + " Wrong Guesses left");
                }
            } else {
                System.out.println("Only letters allowed!");
                tries--;
                continue;
            }
            if (word.equals(new String(chararray))) {
                System.out.println("");
                System.out.println("Congratulations! You have won!");
                playAgainOrEnd();
            }
            if (7 - tries == 0){
                System.out.println("");
                System.out.println("You have lost!");
                System.out.println("The word was " + word);
                playAgainOrEnd();
            }

        }


    }


    private static ArrayList<String> setUpHangman() {
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
    private static int getValidIntegerInput() {
        while (true) {
            if (!input.hasNextInt()) {
                input.nextLine();
                System.out.println("Write a number between 1-3!");
                continue;
            }

            int returnValue = input.nextInt();
            input.nextLine();
            return returnValue;
        }
    }

}



