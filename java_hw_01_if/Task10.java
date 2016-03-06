import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете обем :");
		int v = sc.nextInt();
		
		if(v >= 10 && v <= 9999){
			
			int times = v / 5;
			int plus = v % 5;
			
			System.out.println(times + " пъти по " + "2 литра");
			System.out.println(times + " пъти по " + "3 литра");
			System.out.println("допълнително кофа от " + plus + " литра");
		}
		else{
			System.out.println("Обемът трябва да е м/у 10 и 9999л !");
		}
	}

}
