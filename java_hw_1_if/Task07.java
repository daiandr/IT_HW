import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ��� :");
		int time = sc.nextInt();
		System.out.println("�������� ���� ���� : ");
		float money =sc.nextFloat();
		System.out.println("�������� �����/�����(true/false): ");
		boolean health = sc.nextBoolean();
		
		if(health == false){
			System.out.println("�� �� ���� �����");
		}
		if(health == false && money > 0){
			System.out.println("�� �� ���� ���������");
			
		}
		else if (health == false && money <= 0){
			System.out.println("�� ���� ����� � �� ��� ���");
		}
		if (health == true ){
			System.out.println("�� ����� �� ���� � ��������");
			
		}
		else if (health == true && money < 10){
			System.out.println("�� ����� �� ����");
		}
	
	}
}
