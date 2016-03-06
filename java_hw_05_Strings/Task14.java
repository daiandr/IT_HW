
public class Task14 {

	static int factorial(int num) {
		if (num == 1) {
			return 1;
		}
		return factorial(num - 1) * num;
	}

	public static void main(String[] args) {
		int num = 10;
		System.out.println(factorial(num));
	}

}
