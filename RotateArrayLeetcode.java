package newpackage;

public class RotateArrayLeetcode {
public static void main(String args[]) {
	int arr[]= {1,2,3,4,5,6,7};
	int nums[]=rotateArray(arr,3,7);
	printArray(nums,7);
}

public static int[] rotateArray(int nums[],int d, int size) {
	
	for(int i=0;i<d;i++) {
		int temp=nums[size-1];
		for(int j=size-1;j>0;j--) 
			nums[j]=nums[j-1];
		
		nums[0]=temp;
		
		}
	return nums;
}

public static void printArray(int nums[],int size) {
	for(int i=0;i<size;i++) {
		System.out.print(nums[i]);
	}
}
}
