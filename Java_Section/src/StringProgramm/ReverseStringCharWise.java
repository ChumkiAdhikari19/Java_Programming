package StringProgramm;


public class ReverseStringCharWise {
		public static void main(String[] args) {
			String s="wellcome to india";
			char [] ch=s.toCharArray();
			String out="";
			
			for(int i=0; i<s.length(); i++)
			{
				String word="";
				while(i<ch.length && ch[i]!=' ')
				{
					word=ch[i]+word;
					i++;
				}
				out=out+word+" ";
			}
			System.out.println(out);

		}

	}


