import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		System.out.println("Enter c :");
		int c = sc.nextInt();
		
	if(a < b && b < c ){
		System.out.println( c + "," + b + "," + a  );
		}	
	if(a > b && b > c ){
		System.out.println( a + "," + b + "," + c  );
		}	
	if(a < b && b > c && c > a){
		System.out.println( b + "," + c + "," + a  );
		}	else if(a < b && b > c && c < a){System.out.println( b + "," + a + "," + c );}
	
	if(a > b && b < c && a > c){
		System.out.println( b + "," + a + "," + c  );
		}	else if (a > b && b < c && c > a){System.out.println( b + "," + c + "," + a );}
	}

}
