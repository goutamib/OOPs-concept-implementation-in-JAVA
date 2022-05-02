
public class LengthofLastWord {
public static void main(String args[]) {
	String s="   Hello world goutami ";
	String str= s.trim();
	String[] s1= str.split(" ");
	System.out.println(s1[s1.length-1].length());
			}
}
