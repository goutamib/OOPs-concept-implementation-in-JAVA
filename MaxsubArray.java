package newpackage;

public class MaxsubArray {
public static int maxsubArraySum(int[]arr, int size) {
	int globalmax=0;
	int submax=Integer.MIN_VALUE;
	System.out.println(submax);
	for(int i=0;i<size;i++) {
		globalmax=globalmax+arr[i];
		
	
	if(globalmax<0) {
		globalmax=0;
	}
	if(submax< globalmax) {
		submax=globalmax;
	}}
	return submax;
}
public static void main(String args[]) {
	int arr[]= {1,-2,3,4,-4,6,-4,3,2};
	System.out.println("max sub array sun::"+maxsubArraySum(arr,9));
}
}
