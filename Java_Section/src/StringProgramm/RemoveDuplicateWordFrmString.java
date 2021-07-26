package StringProgramm;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordFrmString {
	
	public static void main(String[] args) {
		String s="automation engineer manual engineer";
		String [] str=s.split(" ");
		
		// create Set collection to get only unique char
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		
		for (String word : set) {
			System.out.print(word+" ");
			
		}
	}

}



