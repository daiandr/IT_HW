import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1 :");
		int a = sc.nextInt();
		System.out.println("Enter number 2 :");
		int b = sc.nextInt();
		
	 	int sum = a + b;
		int dif = a - b;
		int div = a / b;
		int mult = a * b;
		int left = a % b; 
		
	/*	double sum = a + b;
		double dif = a - b;
		double div = a / b;
		double mult = a * b;
		double left = a % b; */
		
		System.out.println("������ �� ������� � : " + sum);
		System.out.println("��������� ��� ������� � : " + dif);
		System.out.println("�������� �� ������� � : " + div );
		System.out.println("�������������� �� ������� � : " + mult);
		System.out.println("�������� �� ��������� ��� ������� � : " + left);
		

	}

}
