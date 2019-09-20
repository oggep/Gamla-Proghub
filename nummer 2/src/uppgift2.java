import java.util.Scanner;

public class uppgift2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0;
		int largest = -1000000;
		int smallest = 1000000;
		int sum = 0;		
		
		for (int i = 0; i < 10; i++) {
			x = input.nextInt();
			sum = sum + x;
			if(x<smallest) {
				smallest=x;
			}
			if(x>largest) {
				largest=x;
			}
			
		}
		
		
		System.out.println("Medelvärde: " + (float)sum / 10);
		System.out.println("Minsta: " + smallest);
		System.out.println("Största: " + largest);
	}
}
