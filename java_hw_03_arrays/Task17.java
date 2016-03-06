
public class Task17 {
	public static void main(String[] args) {
		int[] arr = {1,2,2,4,2,7,3,5,4,8,6};
		int index = 1;
		boolean isZigg = false;
		
		while(index < arr.length){
			if(arr[index] > arr[index-1] && arr[index] > arr[index+1]){
			isZigg = true;
			index = index + 2;
			}else{
				isZigg = false;
				System.out.println("Nope!");				
				break;
			}
		}
		if(isZigg == true){
		System.out.println("Yup!");
		}
	}
}
