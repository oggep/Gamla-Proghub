package kattisuppgifter;
import java.util.Scanner;
public class Fondr�knare {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Vad �r din r�nta?");
		double R = input.nextDouble();
		
		int z = 0;
		
		System.out.println("Hur m�nga m�nader vill du spara?");
		int M = input.nextInt();
		
		System.out.println("Hur mycket vill du spara i m�naden");
		int MS = input.nextInt();
		
		for(int i = 1 ; i <= M; i++) {
				if(i % 12 == 0) {
					z = M / 12;
					for(int b = 1 ; b <= z; b++) {	
					System.out.println(MS * 12 * R );
			
					}
					
				}
				
				
			}
			
			
		}
}

	


