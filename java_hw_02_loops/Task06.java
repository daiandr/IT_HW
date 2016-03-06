import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = key.nextInt();
		int sum = 0;
		
		for (int i = 1 ; i <= num ; i++){
			sum = sum + i;
			}
		
		System.out.println("The sum is : " + sum);
	}

}
