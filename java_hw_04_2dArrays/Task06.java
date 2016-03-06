
public class Task06 {

	public static void main(String[] args) {

		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int sum = 0;
		int sum2 = 0;
		for(int row = 1 ; row < 7 ; row++){
			if(row % 2 == 0){
			for(int col = 0 ; col < 6 ; col++){
				System.out.print(arr[row - 1][col] + ", " );
				sum = sum + arr[row - 1][col];
			}
			}else{
				continue;
			}
			System.out.print("sum " + sum);
			System.out.println();
			sum2 = sum2 + sum;
			sum = 0;
		}
		System.out.println("The sum of all even rows is:  " + sum2 );
		
	}

}
