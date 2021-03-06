package StringProgramm;

import java.util.HashSet;

public class FindDuplicateCharFromString {

	public static void main(String[] args) {
		String s="occurrence";
		
		// create Set collection to get only unique char
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		
		//compare each character of set with all char og given string
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
			if(count>1)
			{
				System.out.println(ch+ " = "+count);
			}
		}
	}

}
