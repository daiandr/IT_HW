
public class Task03 {
	public static void main(String[] args) {


		int[][] arr = { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 }, { 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 11 }, { 61, 69, 63, 64, -22 } };
		int sum = 0;
		int avrg = 0;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < 5; col++) {				
				sum = sum + arr[row][col];			
			}
			avrg = sum /(arr.length*5);
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The average is ~ " + avrg);
	}

}
