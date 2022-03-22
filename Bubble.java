package newpackage;

public class Bubble {
public static void main(String args[]) {
	int[] arr= {7,6,5,8,3,2,1,4};
	Bubble b=new Bubble();
	
	System.out.print("before sort::");
	b.printArray(arr);
	b.sort(arr);
	System.out.print("after sort::");
	b.printArray(arr);
}
public void printArray(int[] arr)
{
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
public void sort(int[] arr) {
	int temp,i,j;
	int n=arr.length;
	for(i=0;i<n-1;i++)
		for(j=0;j<n-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
}
}

