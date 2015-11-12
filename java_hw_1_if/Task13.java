import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature :");
		int t = sc.nextInt();
		
		if(t <= -20 && t >= -100){
			System.out.println("Freezing");
		}
		if(t > -20 && t <= 0){
			System.out.println("Cold");
		}
		if(t > 0 && t <= 15){
			System.out.println("Chilly");
		}
		if(t > 15 && t < 25){
			System.out.println("Warm");
		}
		if(t >= 25 && t <= 100){
			System.out.println("Hot");
		}
		if(t < -100 || t > 100){
			System.out.println("No such temperature!");
		}
		

	}

}
