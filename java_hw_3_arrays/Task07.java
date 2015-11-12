
public class Task7 {
	public static void main(String[] args) {

		int[] arr = { 21, 3, 4, 24, 45, 32, 71, 12 };

		int[] newArr = new int[arr.length];

		newArr[0] = arr[1];
		newArr[newArr.length - 1] = arr[arr.length - 2];

		for (int index = 1; index < newArr.length - 1; index++) {
			newArr[index] = arr[index - 1] + arr[index + 1];
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + ",");
		}

	}

}
