import java.util.
import java.util.Scanner;
public class talspelet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vilken svårighetsgrad? Easy, Normal, Hard");
        String Difficulty = input.nextLine();
        if(Difficulty == "Easy"){
            Easy();
        }
        if(Difficulty == "Normal"){
            Normal();
        }
        if(Difficulty == "Hard"){0
            Hard();
        }
    }

    private static void Hard() {

    }

    private static void Normal() {
    }

    private static void Easy() {
    }
}
