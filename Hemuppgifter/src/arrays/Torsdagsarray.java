
package arrays;

public class Torsdagsarray {
	public static void main(String[] args) {
	int years = 0;
	String[] names = {"Tomas", "Tomas", "Tomas", "Are", "Tomas", "Are", "Tomas", "Are", "Tomas", "Niklas"};
	for(String name: names) {
	if(name.equals("Are")) {
		years++;
	}	
		
	}
	System.out.println(years);
	}
}
