
public class Task12 {
	public static void main(String[] args) {

		for (int num = 100; num <= 999; num++) {

			int first = num / 100;
			int a = num % 100;
			int second = a / 10;
			int b = a % 10;
			int third = b / 1;

			if (first == second || second == third || first == third) {
				continue;
			} else {
				System.out.print(num + ",");
			}

		}//for
	}//main

}
