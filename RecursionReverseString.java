package newpackage;

public class RecursionReverseString {
public static void main(String[] args) {
	String s="Goutami";
	System.out.print(reverse(s));
}
public static String reverse(String s) {
	if(s.isEmpty())
		return s;
	else return reverse(s.substring(1))+s.charAt(0);
}
}
