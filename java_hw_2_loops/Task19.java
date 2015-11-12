import java.util.Scanner;

public class Task19 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = key.nextInt();
		if(num >= 10 && num <= 99){
		for (int i = 0; i <= 1000; i++) {
			if (num > 1) {
				if (num % 2 == 0) {
					num = num / 2;
				} else {
					num = (num * 3) + 1;
				}
				System.out.print(num + ",");
			} else {
				break;
			}

		}
		}else{
			System.out.println("Number must be between 10 and 99 !");
		}
	}

}
