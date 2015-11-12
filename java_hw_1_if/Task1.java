import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a :");
		double a = sc.nextDouble();
		System.out.println("Enter b:");
		double b = sc.nextDouble();
		System.out.println("Enter c:");
		double c = sc.nextDouble();
		
		
	if(a > c && c > b || a < c && c < b){
		System.out.println("c is between a and b ");
	}
	else{
		System.out.println("c isn't between a and b ");
	}
	}

}
