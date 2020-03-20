import java.util.Random;
import java.util.Scanner;
public class talspelet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vilken svårighetsgrad?  Easy, Normal, Hard");
        System.out.println("1. Easy");
        System.out.println("2. Normal");
        System.out.println("1. Hard");
        int Difficulty = input.nextInt();
        if(Difficulty == 1){
            easy();
        }
        if(Difficulty == 2){
            normal();
        }
        if(Difficulty == 3){
            hard();
        }
    }

    private static void easy() {

    }

    private static void normal() {
    }

    private static void hard() {
    }
}
