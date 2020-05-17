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
    private static ArrayList<String> hangmananimation = setuphangman();
    private static Scanner input = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {
        word = "";
        startMenu();
        while (true){
            startMenu();
            System.out.println("Do you want to play again?");
            int playagain =input.nextInt();
            input.nextLine();
            if(playagain != 1){
                break;
            }
        }
        System.out.println("Goodbye!");
    }

    public static void startMenu() {

        System.out.println("Welcome to Hangman");
        System.out.println("What length of words do you want?");
        System.out.println("1. Short");
        System.out.println("2. Medium");
        System.out.println("3. Long");
        menu = input.nextInt();
        input.nextLine();
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
        System.out.println(word);
        for (int tries = 1; tries <= 7; tries++) {
            System.out.println("Choose a letter!");
            char letter = input.nextLine().toLowerCase().charAt(0);
            if (Character.isLetter(letter)) {
                if (word.contains(letter + "")) {
                    for (int j = 0; j < chararray.length; j++) {
                        if (word.charAt(j) == letter) {
                            chararray[j] = letter;
                            tries--;
                        }
                    }
                }
                else {
                    System.out.println(hangmananimation.get(tries));
                    System.out.println(7 - tries + " Guesses left");
                }
            }

            System.out.println(chararray);
        }


    }

    private static ArrayList<String> setuphangman() {
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