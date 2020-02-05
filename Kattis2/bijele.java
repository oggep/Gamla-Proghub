import java.util.Scanner;
public class bijele{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Först gör jag mina arrayer för att ha värdena som behövdes.
		int[] staff = {1, 1, 2, 2, 2, 8};
		int[] number = new int[6];
		
		
			//Sen gör jag en loop för man skriva in rätt antal med tal och vilka som man ska räkna med
			for (int i = 0; i < number.length; i++) {    
				number[i] = input.nextInt();
			//Med denna räknar jag ut resultat på varje rad.	
			System.out.println(staff[i] - number[i]);
			}
		}
	}

			





