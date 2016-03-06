import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете час :");
		int time = sc.nextInt();
		System.out.println("Въведете сума пари : ");
		float money =sc.nextFloat();
		System.out.println("Въведете здрав/болен(true/false): ");
		boolean health = sc.nextBoolean();
		
		if(health == false){
			System.out.println("ще си стоя вкъщи");
		}
		if(health == false && money > 0){
			System.out.println("ще си купя лекарства");
			
		}
		else if (health == false && money <= 0){
			System.out.println("ще стоя вкъщи и ще пия чай");
		}
		if (health == true ){
			System.out.println("ще отида на кино с приятели");
			
		}
		else if (health == true && money < 10){
			System.out.println("ще отида на кафе");
		}
	
	}
}
