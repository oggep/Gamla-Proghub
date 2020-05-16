import java.util.Scanner;

public class hangmangame {
    private static int menu;
    private static String[] shortwords = {"car", "foot", "rain", "sand", "cow", "shoe","dirt"};
    private static String[] mediumwords = {"forest", "bottle", "teeth", "bored", "forced", "knife"};
    private static String[] longwords = {"skydiving", "Communicate", "friendzone", "vandalize", "shockproof", "advanced"};
    int menu = 0;
    private static String word ="";
    public static void main(String[] args){
        startMenu();
    }
    public static String startMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Hangman");
        System.out.println("What length of words do you want?");
        System.out.println("1. Short");
        System.out.println("2. Medium");
        System.out.println("3. Long");
        menu = input.nextInt();
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
            public static String shortWord(String word) {
            word = hangmangame.shortwords[(int) (Math.random() * shortwords.length)];
            return word;}

            public static String mediumWord(String word) {
            word = hangmangame.mediumwords[(int) (Math.random() * mediumwords.length)];
            return word;
        }
            public static String longWord(String word) {
            word = hangmangame.mediumwords[(int) (Math.random() * mediumwords.length)];
            return word;
        }
    public static String chooseWord(hangmangame.shortwords, mediumwords, longwords){

        }

    }

}
