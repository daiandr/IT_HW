import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99){
			
		int mult = num1 * num2;
		int last = mult % 10;
		
		//System.out.println(mult + " " + last);
		
		if(last % 2 == 0){
			System.out.println(mult + ", " + last + ", even" );
		}
		else{
			System.out.println(mult + ", " + last + ", odd" );			
		}

		}
		else{
			System.out.println("Both numbers must have two digits !");
		}

	}

}
