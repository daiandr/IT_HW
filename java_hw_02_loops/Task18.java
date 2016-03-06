import java.util.Scanner;

public class Task18 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = key.nextInt();
		System.out.println("Enter second number: ");
		int num2 = key.nextInt();
		int loop = 0 ;
		
		if(num2 >= num1){
			loop = num2;
		}else{
			loop = num1;
		}

		if (num1 >= 1 && num1 <= 10 && num2 >= 1 && num2 <= 10) {
			for (int mult = 1; mult <= loop; mult++) {
				int res0 = mult * mult;
				int res1 = num1 * mult;
				int res2 = num2 * mult;
				System.out.println(mult + "*" + mult + "=" + res0);
				System.out.println(num1 + "*" + mult + "=" + res1);
				System.out.println(num2 + "*" + mult + "=" + res2);
			}
		} 

	}
}
