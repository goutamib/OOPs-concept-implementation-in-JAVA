package newpackage;

public class RotateArray {
public static void main(String args[]) {
	RotateArray rotate= new RotateArray();
	int[] arr= {1,2,3,4,5,6,7};
	//rotate.printArray(arr);
	rotate.leftRotate(arr,2,7);
	//rotate.rotateOnebyOne(arr,7);
	rotate.printArray(arr);
}
public void printArray(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
}
public void rotateOnebyOne(int[]arr,int size) {
	int temp=arr[0];
	
	for(int i=0;i<size-1; i++) 
		
		arr[i]=arr[i+1];
		arr[size-1]=temp;
		
	
}
public void leftRotate(int[] arr, int d, int size) {
	for(int i=0;i<d;i++) {
		rotateOnebyOne(arr,size);
	}
	}
}

