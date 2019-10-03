import java.util.Scanner;
public class kattis4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		for (int i = 1 ; i <= z; i++){
		 
		
		if(i % y == 0 && i % x == 0){ System.out.println("fizzbuzz");
			}
		else if(i % x == 0){ 
			System.out.println("Fizz");
		 }	
		 
		else if (i % y == 0){ 
				System.out.println("Buzz");
				
			}
		 else if (i % x != 0 && i % y != 0){
				System.out.println(i);
			}
		 }
			 }	
        }



