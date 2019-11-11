
import java.util.Scanner;
public class uppgift1 {

	public static void main(String[] args) {
		dubbel(args);
		
	}
	public static void dubbel(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("nummer");
		int z = input.nextInt();
		System.out.println((z*4*3.14)/3);
		
	}

}

