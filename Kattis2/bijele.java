import java.util.Scanner;
public class bijele{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//F�rst g�r jag mina arrayer f�r att ha v�rdena som beh�vdes.
		int[] staff = {1, 1, 2, 2, 2, 8};
		int[] number = new int[6];
		
		
			//Sen g�r jag en loop f�r man skriva in r�tt antal med tal och vilka som man ska r�kna med
			for (int i = 0; i < number.length; i++) {    
				number[i] = input.nextInt();
			//Med denna r�knar jag ut resultat p� varje rad.	
			System.out.println(staff[i] - number[i]);
			}
		}
	}

			





