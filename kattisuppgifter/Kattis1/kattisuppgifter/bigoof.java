package kattisuppgifter;
import java.util.Scanner;
public class bigoof {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String go = input.nextLine();
	String po = input.nextLine();
	String bo = input.nextLine();
	String fist = go.substring(0, 1);
	String fist2 = po.substring(0, 1);
	String fist3 = bo.substring(0, 1);
	System.out.println(fist + fist2 + fist3);
	
}
}
