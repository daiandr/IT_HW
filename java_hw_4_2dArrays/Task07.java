
public class Task07 {
	public static void main(String[] args) {
		
		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int sum = 0;
		int max = 0;
		for(int row = 0; row < 6; row++){
			for(int col = 0; col < 6; col++){
				if(row + col == 0 || (row + col) % 2 == 0){
					System.out.print(arr[row][col] + ", ");	
					sum = sum  + arr[row][col];
				}
			}
			System.out.print("sum: " + sum);
			System.out.println();
			max = max + sum;
			sum = 0;
			
		}System.out.println("The sum of the elements is: " + max);
	}

}
