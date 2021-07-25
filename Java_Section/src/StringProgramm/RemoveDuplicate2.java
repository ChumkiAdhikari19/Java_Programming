package StringProgramm;

import java.util.LinkedHashSet;

public class RemoveDuplicate2 {
	public static void main(String[] args) {
		String s="mama";
		
		// create Set collection to get only unique char
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		
		for (Character ch : set) {
			System.out.print(ch);
			
		}
	}

}
