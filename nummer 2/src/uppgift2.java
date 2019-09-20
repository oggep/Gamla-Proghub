import java.util.Scanner;

public class uppgift2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0;
		int largest = -1000;
		int smallest = 1000;
		int sum = 0;		
		
		for (int i = 0; i < 10; i++) {
			x = input.nextInt();
			sum = sum + x;
			
		}
		
		
		System.out.println("Medelvärde: " + (float)sum / 10);

	}
}
