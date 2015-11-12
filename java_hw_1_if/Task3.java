import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a : ");
	int a = sc.nextInt();
	System.out.println("Enter b : ");
	int b = sc.nextInt();
	
	int c = b;
		
	if(a != b){
		b = a;
		a = c;
		System.out.println("a = " + a + " b = " + b);
				
		}
	else{
		System.out.println("The numbers must be different!");
	}
	}

}
