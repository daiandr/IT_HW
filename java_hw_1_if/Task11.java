import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three digit number (no 0s) :");
		int num = sc.nextInt();
		
		int first = num / 100;
		int a = num % 100;
		int second = a / 10;
		int third = a % 10; 
		
		//System.out.println(first +" "+ second +" "+ third);
		
		if(num >= 100 && num <= 999 && first != 0 && second != 0 && third != 0){
			
			if(num % first == 0){
				System.out.println(num + " divides by " + first);
			}
			else{
				System.out.println(num + " doesnt divide by " + first);
			}
			if(num % second == 0){
				System.out.println(num + " divides by " + second);
			}
			else{
				System.out.println(num + " doesnt divide by " + second);
			}
			if(num % third == 0){
				System.out.println(num + " divides by " + third);
			}
			else{
				System.out.println(num + " doesnt divide by " + third);
			}
			
		}
		else{
			System.out.println("The number must have three digits with no 0s !");
		}
		

	}

}
