import java.util.Scanner;
public class bijele{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] staff = {1, 1, 2, 2, 2, 8};
		int[] number = new int[6];
		
		
			
			for (int i = 0; i < number.length; i++) {    
				number[i] = input.nextInt();
				
			System.out.println(staff[i] - number[i] + " ");
			}
		}
	}

			





