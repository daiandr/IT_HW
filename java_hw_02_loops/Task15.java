import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = key.nextInt();
		int sum = 0 ;
		int i = 1;
		do{
			sum = sum + i;
			i++;
		}
		while(i <= num);
		System.out.println(sum);
	}

}
