import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		System.out.println("Enter a number : ");
		int b = sc.nextInt();
		
		if(a > b){
			System.out.println(b + " , " + a);
		}
		if (a < b){
			System.out.println(a + " , " + b);			
		}
		if (a == b){
			System.out.println("The numbers are equal!");
		}
		

	}

}
