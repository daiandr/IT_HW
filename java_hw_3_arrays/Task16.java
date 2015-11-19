
public class Task16 {
	public static void main(String[] args) {

		double[] arr = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4 };
		double sum = 0;
		int count = 0;
		double avrg = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < -0.231) {
				arr[index] = ((index + 1) * (index + 1)) + 41.25;
			} else {
				arr[index] = arr[index] * (index + 1);
			}
			if (arr[index] != 0) {
				sum = sum + arr[index];
				count++;
			}
		}

		avrg = sum / count;
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		System.out.println("The average of the numbers is: " + avrg);

	}
}
