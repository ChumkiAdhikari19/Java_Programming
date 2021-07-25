package ReverseString;

public class Pro1 {

	public static void main(String[] args) {
		String s1="chumki is my name";
		char [] ch=s1.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);
}
}
