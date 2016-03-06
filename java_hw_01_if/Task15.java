import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour :");
		int hour = sc.nextInt();
		
		if(hour < 0 || hour > 24){
			System.out.println("No such hour!");
		}
		if(hour >= 18 && hour <= 24){
			System.out.println("Good evening");
		}
		if(hour <= 4 && hour >= 0){
			System.out.println("Good evening");
		}
		if(hour > 4 && hour <= 9){
			System.out.println("Good morning");
		}
		if(hour > 9 && hour < 18){
			System.out.println("Good day");
		}

	}

}
