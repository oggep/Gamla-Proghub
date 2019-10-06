
import java.util.Scanner;
public class kattis5 {	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int timmar = input.nextInt();
	int minuter = input.nextInt();

	minuter -= 45;

	if (minuter < 0)
    {
    timmar -= 1;
    minuter += 60;
    }
	
	if (timmar < 0)
    timmar = 23;

		System.out.println(timmar + " " + minuter);
    }
}