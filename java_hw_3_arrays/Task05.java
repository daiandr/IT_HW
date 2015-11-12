
public class Task5 {
	public static void main(String[] args) {

		int[] arr = new int[10];
		int mult = 0;

		for (int index = 0; index < arr.length; index++) {

			mult = index;

			arr[index] = mult * 3;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
