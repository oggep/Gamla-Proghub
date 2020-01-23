
package kattisuppgifter;

import java.util.Scanner;


public class rep1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int b = input.nextInt();
		
		int c = input.nextInt();
		
		if(c > b) {
			
			System.out.println(c);
	
		}
		else if(b > c) {
			System.out.println(b);
		}

	}

}
