import java.util.Scanner;
import java.util.Random;
public class hangmangame {
    String[] shortwords = {"car", "foot", "rain", "sand", "cow", "shoe","dirt"};
    String[] mediumwords = {"forest", "bottle", "teeth", "bored", "forced", "knife"};
    String[] longwords = {"skydiving", "Communicate", "friendzone", "vandalize", "shockproof", "advanced"};
    public static void main(String[] args){
        startMenu();
    }
    public static void startMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Hangman");
        System.out.println("What length of words do you want?");
        System.out.println("1. Short");
        System.out.println("2. Medium");
        System.out.println("3. Long");
        int menu = input.nextInt();
        switch (menu){
            case 1:
                System.out.println("Redirecting you to short words...");
                break;
            case 2:
                System.out.println("Redirecting you to medium words...");
                break;
            case 3:
                System.out.println("Redirecting you to long words...");
                break;

        }


    }

}
