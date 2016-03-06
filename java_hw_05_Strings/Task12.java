import java.util.Arrays;

public class Task12 {
	static int[] CreateArray (int num){
		
		int[] arr = new int[num];
		int count = 1;
		for(int index = 0; index < arr.length; index++){			
			arr[index] =count;
			count++;
		}		
		return arr;
	}
	public static void main(String[] args) {
		int num = 10;
		
		System.out.println(Arrays.toString(CreateArray(num)));
		
	}

}
