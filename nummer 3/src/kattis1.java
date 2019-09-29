
import java.util.Scanner;
public class kattis1 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("skriv 2 heltal mellan 1000 och -1000");
	int r1 = 0;
	int s = 0;
	r1 = input.nextInt(); 
	s = input.nextInt();
	int r2 = 2*s - r1;
	System.out.println(r2);
}
}
