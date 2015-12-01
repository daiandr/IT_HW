import java.util.Arrays;

public class Task13 {
	
	static int[] mergeArrays(int[]arr1, int[] arr2){
		int[] arr = new int[arr1.length + arr2.length];
		int num = 0;
		for(int index = 0; index < arr1.length; index++){
			arr[index] = arr1[index];
		}
		for(int index = arr1.length; index < arr.length;index++){
			arr[index] = arr2[num];
			num++;		
		}
		return arr;
		
	}
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7,8,21,4};
		int[] arr2 = {3,4,5,6,3,234,2,239,8};
		
		System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
	}

}
