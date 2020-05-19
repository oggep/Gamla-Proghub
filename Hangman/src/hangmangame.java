import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class hangmangame {

    //Dessa string arrayer är orden spelen kan välja mellan för de olika svårighetsgraderna.
    private static String[] shortwords = {"car", "foot", "rain", "sand", "cow", "shoe", "dirt"};
    private static String[] mediumwords = {"forest", "bottle", "teeth", "bored", "forced", "knife"};
    private static String[] longwords = {"skydiving", "Communicate", "friendzone", "vandalize", "Football", "advanced"};

    //Variablerna under är mina globala variabler.
    private static String word;
    private static int menu = 0;
    private static char[] chararray;
    private static ArrayList<String> hangmananimation = setUpHangman();
    private static Scanner input = new Scanner(System.in);
    private static Random rand = new Random();


    //Detta är min main-metod och den kopplar bara spelaren till spelets startmeny.
    public static void main(String[] args) {
        startMenu();
    }
    /*
    Detta är min metod om man vill spela igen när man har spelat spelet redan. Då kommer en meny som frågar om man
    vill spela igen och den ger instruktioner till hur man spelar igen genom att trycka på 1an på
    ditt tangentbord annars om man trycker på något annat så slutar spelet.
     */
    public static void playAgainOrEnd(){
        while (true) {
            System.out.println("");
            System.out.println("Do you want to play again?");
            System.out.println("Press 1 if you want to play again, press 2 or 3 if you don't want to play again.");
            int playagain = getValidIntegerInput();
            if (playagain != 1) {
                break;
            }
            startMenu();
        }
        System.out.println("Goodbye!");
        System. exit(0);
    }
    /*
        Detta är min startmeny och här väljer man vilken svårighetsgrad man vill spela som korta, mellanlånga,
        långa ord. Man skriver in siffran framför svårighetsgraden för att välja den så 1 är korta ord sen så kopplas
        man till case 1 som kopplar vidare dig till ett metoden som väljer ett random ord i för din svårighetsgrad.
     */
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
    /*
        Detta är metoden för shortWord och det är här de korta orden slumpas och väljer ett av dem och
        Tömmer chararrayen så man kan gissa i den senare kopplas man vidare till checkLetter.
     */
    private static void shortWord() {
        word = "";
        word = shortwords[rand.nextInt(shortwords.length)];
        chararray = new char[word.length()];
        for (int i = 0; i < chararray.length; i++) {
            chararray[i] = '_';
        }
        checkLetter();
    }
    /*
        Detta är metoden för mediumWord och det är här de mellanlånga orden slumpas och väljer ett av dem och
        Tömmer chararrayen så man kan gissa i den senare kopplas man vidare till checkLetter.
     */
    private static void mediumWord() {
        word = "";
        word = mediumwords[rand.nextInt(mediumwords.length)];
        chararray = new char[word.length()];
        for (int i = 0; i < chararray.length; i++) {
            chararray[i] = '_';
        }
        checkLetter();
    }
    /*
        Detta är metoden för longWord och det är här de långa orden slumpas och väljer ett av dem och den skapar
        en char array av ordet. Sen tömmer chararrayen så man kan gissa i den.
        Den senare kopplas man vidare till checkLetter.
     */
    private static void longWord() {
        word = "";
        word = longwords[rand.nextInt(longwords.length)];
        chararray = new char[word.length()];
        for (int i = 0; i < chararray.length; i++) {
            chararray[i] = '_';
        }
        checkLetter();
    }
    /*
        Detta är själva huvudpunketen av spelet där saker händer. Först går man igenom en for loop som alltid
        lägger till en tries och den göra att man bara kan gissa fel 7 gånger.
        sen gissar man på en bokstav och den känner av stora bokstäver och små som samma.
        Om bokstaven är med i ordet så försvinner en tries.
        Om man har en rätt bokstav så byt ett "_" till bokstaven efter den har verifierat att den stämmer.
        Om tecknet man gissar på inte är en bokstav kommer ett meddelande upp som ligger längre ner.
     */
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
                /*
                Denna gör att om man har ett fel så kopplas man över till min bild där min gubbe hängs lite åt
                gången beroende på hur många gissningar man har gjort.
                Den printar också ut hur många gissningar man har kvar.
                */
                } else {
                    System.out.println(hangmananimation.get(tries - 1));
                    System.out.println(7 - tries + " Wrong Guesses left");
                }
            /*
                Denna kommer ut om man gissar på ett tecken som inte är en bokstav. Den kopplas hit på grund av
                .isLetter som finns längre upp i metoden.
            */
            } else {
                System.out.println("Only letters allowed!");
                tries--;
                continue;
            }
            /*
                Denna dyker upp om du vinner först jämför orginal ordet med dina bokstäver som du har gissat fram och
                ser om ordet stämmer eller om det fattas bokstäver i din gissning fortfarande.
                Sen kopplas till spela igen menyn.
            */
            if (word.equals(new String(chararray))) {
                System.out.println("");
                System.out.println("Congratulations! You have won!");
                playAgainOrEnd();
            }
            /*
                Denna dyker upp om du förlorar för du har gissat 7 olika gånger.
                Då får man se vad ordet var och sen efter den kopplas till spelaigenmenyn.
            */
            if (7 - tries == 0){
                System.out.println("");
                System.out.println("You have lost!");
                System.out.println("The word was " + word);
                playAgainOrEnd();
            }

        }


    }

    /*
    Dessa är alla mina 7 olika hängagubbe bilder. man kopplas hit när man har gissat fel högre upp i projektet.
    Sedan kopplas man till spelaigenmenyn.
     */
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
    /*
    Denna gör så att spelet inte krashar när man skriver något annat än en siffra. Den gör också så att man endast
    kan välja siffror mellan 1-3 för startmenyn och spelaigenmenyn.
     */
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



