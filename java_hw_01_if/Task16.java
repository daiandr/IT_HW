import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three digit number :");
		int num = sc.nextInt();
		
		int first = num / 100;
		int a = num % 100;
		int second = a / 10;
		int third = a % 10; 
		
		
		if(first == second && second == third){
			System.out.println("The numbers are equal");
		}else
		
		if(first > second && second > third){
			System.out.println("The numbers are descending");
		}else
		
		if(first < second && second < third){
			System.out.println("The numbers are ascending");
		} else {
			System.out.println("The numbers arent in oreder !");
		}

	}

}
