package ReverseString;

public class WithoutTochar {

	public static void main(String[] args) {
		/*String s="chumki";
		char [] ch=s.toCharArray();
		String rev="";
		for(int i=ch.length-1; i>=0; i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
		}
}*/
	//WITH OUT TO CHHAR
		/*String s="pocho";
	String rev="";
	for(int i=s.length()-1; i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	}	
	}*/
		
		//WITH OUT TOCHAR ND 3RD VAR
		/*String s="ahaan";
		 for(int i=s.length()-1; i>=0;i--) {
			 System.out.print(s.charAt(i));
		 }
	}
}*/
		
		
		//INDEX START WITH 0
		
		
		String s="my name is chumki";
		char []ch=s.toCharArray();
		String rev="";
		
		for(int i=0; i<ch.length;i++) {
			rev=ch[i]+rev;
		}
		System.out.println(rev);
	}
}
		
		
		
		
		
		
