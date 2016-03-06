public class Task09 {
	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5,6,7};
//		int[] a2 = new int[a1.length];
		int length = a1.length-1;
		int first = 0;
		
		for(int i = 0; i < a1.length/2 ;i++){
			a1[first] = a1[first] + a1[length];
			a1[length] = a1[first] - a1[length];
			a1[first] = a1[first] - a1[length]; 
			first++;
			length--;
		}		
			
		
//		for(int index = 0 ; index < a1.length ;index++){			
//			a2[length] = a1[index];
//			length--;			
//		}
//		
		length = a1.length-1;
		for(int index = 0; index < a1.length;index++){
			System.out.print(a1[length] + ",");
			length--;
		}
		
	}

}
