package newpackage;

public class sumArray {
	
	public static void main(String[] args) {
		int[] arr= {23,3,5,34,67,90};
		System.out.println("sum of::"+totalArray(arr));
	}

	public static int totalArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		return sum;
	}
}
