package kattisuppgifter;
import java.util.Scanner;
import java.lang.Math;
public class Fondr�knare {

	

	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Vad �r din r�nta?");
		double R = input.nextDouble();
		
		System.out.println("Hur m�nga �r vill du spara?");
		double M = input.nextInt();
		
		System.out.println("Hur mycket vill du spara i m�naden");
		int Monthlysaved = input.nextInt();
		
		double P = 100 * R;
		
		double Y1 = Monthlysaved * 12;
		for(int i = 1 ; i <= M; i++) {
			System.out.println(Y1 * (Math.pow(R , M)));
					
			
					}
					
				}
				
				
			
			
			
		}


	


