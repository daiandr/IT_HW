import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a four digit positive number :");
		int num = sc.nextInt();
					
		if(num >= 1000 && num <= 9999){
			
			int first = num / 1000;			
			int a = num % 1000;
			int second = a / 100;
			int b = a % 100;
			int third = b / 10;
			int c = b % 10;
			int fourth = c / 1;
			
			//System.out.println(first + " " + second + " " + third + " " + fourth);
			
			int num1 = Integer.parseInt(first + "" + fourth);
			int num2 = Integer.parseInt(second + "" + third);
			
			if(num1 > num2){
				System.out.println(num1 + ">" + num2);
			}
			if(num1 < num2){
				System.out.println(num1 + "<" + num2);
			}
			if(num1 == num2){
				System.out.println(num1 + "=" + num2);
			}
			
			
		}
		else{
			System.out.println("You must enter a 4 digit positive number !");
		}

	}

}
