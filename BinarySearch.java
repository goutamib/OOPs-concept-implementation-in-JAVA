package newpackage;

public class BinarySearch {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	System.out.println("Binary search::"+ search(arr,arr.length,9));
}
public static int search(int[] arr, int size, int value) {
	int mid;
	int low=0;
	int high=size-1;
	while(low <= high) {
		mid=(low+high)/2;
		if(arr[mid]==value) {
			return mid;
		}
		else {
			if(arr[mid]<value)
				low=mid+1;
			else
				high=mid-1;
		}
		
	}
	return -1;
}
}
