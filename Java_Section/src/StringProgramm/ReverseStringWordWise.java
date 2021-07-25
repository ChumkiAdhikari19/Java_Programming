package StringProgramm;

public class ReverseStringWordWise {
	public static void main(String[] args) {
		String s="my name is chumki";
		char [] ch=s.toCharArray();
		String out="";
		
		for(int i=0; i<ch.length; i++)
		{
			String word="";
			while(i<ch.length && ch[i]!= ' ')
			{
				word=word+ch[i];
				i++;
			}
			out=word+" "+out;
		}
		System.out.println(out);

	}

}

