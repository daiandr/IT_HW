import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���� :");
		int v = sc.nextInt();
		
		if(v >= 10 && v <= 9999){
			
			int times = v / 5;
			int plus = v % 5;
			
			System.out.println(times + " ���� �� " + "2 �����");
			System.out.println(times + " ���� �� " + "3 �����");
			System.out.println("������������ ���� �� " + plus + " �����");
		}
		else{
			System.out.println("������ ������ �� � �/� 10 � 9999� !");
		}
	}

}
