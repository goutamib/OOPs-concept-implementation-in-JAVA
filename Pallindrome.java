
public class Pallindrome {
public static boolean isPallindrome(int n) {
	int temp=n;
	int sum=0;
	int r;
	while(n>0) {
		 r = n%10;
		//System.out.println(r);
		sum=sum*10+r;
		n=n/10;
	}
	if(temp==sum)
		return true;
	else return false;
}
public static void main(String args[]) {
	System.out.println(isPallindrome(1221));
}
}
