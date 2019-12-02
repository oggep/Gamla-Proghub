
public class arrayförklaring {

	public static void main(String[] args) {
		int[] arr2 = new int[20];
		
		arr2[0] = 5;
		arr2[1] = 10;
		arr2[2] = 15;
		arr2[3] = 20;
		arr2[4] = 25;
		arr2[5] = 30;
		arr2[6] = 35;
		arr2[7] = 40;
		arr2[8] = 45;
		arr2[9] = 50;
		arr2[10] = 55;
		arr2[11] = 60;
		arr2[12] = 65;
		arr2[13] = 70;
		arr2[14] = 75;
		arr2[15] = 80;
		arr2[16] = 85;
		arr2[17] = 90;
		arr2[18] = 95;
		arr2[19] = 100;
		int[] arrays = {1, 2, 3, 4, 5};
		//5an gånger tabell
		int[] bast = new int[20];
		for(int i = 1; i < 20; i++) {
			bast[i] = i * 5;
			}
		//7an gånger tabell
		int[] banan = new int[15];
		for(int i = 1; i < 15; i++) {
			banan[i] = i * 7;
			System.out.println(banan[i]);
			}
	}

}
