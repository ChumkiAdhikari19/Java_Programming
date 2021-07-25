package StringProgramm;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintOnlyUniqueChar {

	public static void main(String[] args) {
		String s="welcome";
		
		// create Set collection to get only unique char
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		
		//compare each character of set with all char of given string
		
		
		for (Character ch : set) {
			int count=0;
			for(int i=0; i<s.length(); i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			//print char and count
			if(count==1)
			{
				System.out.print(ch);
			}
			
		}
	}

}



