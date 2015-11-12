import java.util.Scanner;

public class Task25 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Eneter a number : ");
		int num = key.nextInt();
		int mult = 1;
		
		while(num > 0){
			mult = mult * num;
			num--;
		}
		System.out.println("N! " + mult);
	}

}
