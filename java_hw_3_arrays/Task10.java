import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		int[] arr = new int[7];
		System.out.println("Enter array elements (7): ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = key.nextInt();
		}
		int sum = 0;
		int avrg = 0;
		int closestSub = 999999999;
		int closestNum = 0;

		for (int index = 0; index < arr.length; index++) {
			sum = sum + arr[index];
		}
		avrg = sum / arr.length;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 0){
				arr[i] = arr[i]*(-1);
			}
			int substract = avrg - arr[i];
			if (substract < 0) {
				substract = substract * (-1);
			}
			if (substract < closestSub) {
				closestSub = substract;
				closestNum = arr[i];
			}

		}
		System.out.println("The average of the numbers is: " + avrg);
		System.out.println("The number closest to the average is: " + closestNum);

	}

}
