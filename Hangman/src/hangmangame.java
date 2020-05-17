import java.util.Scanner;
import java.util.Random;

public class hangmangame {
    private static int menu = 0;
    private static String[] shortwords = {"car", "foot", "rain", "sand", "cow", "shoe", "dirt"};
    private static String[] mediumwords = {"forest", "bottle", "teeth", "bored", "forced", "knife"};
    private static String[] longwords = {"skydiving", "Communicate", "friendzone", "vandalize", "shockproof", "advanced"};
    private static String word = "";

    public static void main(String[] args) {
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
        chooseWord();
    }

    private static void mediumWord() {
        Random rand = new Random();
        word = mediumwords[rand.nextInt(mediumwords.length)];
        chooseWord();
    }

    private static void longWord() {
        Random rand = new Random();
        word = longwords[rand.nextInt(longwords.length)];
        chooseWord();
    }

    public static void chooseWord() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a letter!");
        char doeslettermatch = input.next().charAt(0);
        char[] chararray = word.toCharArray();

        for (char output : chararray) {
            if(doeslettermatch == output){
                System.out.print(doeslettermatch);
            }
            else
                System.out.print("*");
            }
        }
    }

