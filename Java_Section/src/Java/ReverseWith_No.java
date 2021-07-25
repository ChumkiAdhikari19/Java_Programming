package Java;

public class ReverseWith_No {

	public static void main(String[] args) {
		String s1="my name is chumki";
		char [] ch=s1.toCharArray();
		String out="";
		
		for(int i=0; i<ch.length; i++)
		{
			String word="";
			while(i<ch.length && ch[i]!=' ')
			{
				word=word+ch[i];
				i++;
			}
			out=out+word+word.length();
		}

		System.out.println(out);
	}

}
