package StringProgramm;

import java.util.HashSet;

public class RemoveDuplicateWordInStringWithOccrnce {

	public static void main(String[] args) {
		String s="welcome to india welcome to mandya";
		String[] str=s.split(" ");
		
		// create Set collection to get only unique char
		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		
		//compare each character of set with all char og given string
		for (String word : set) {
			{
				int count=0;
				for(int i=0; i<str.length; i++)
				{
					if(word.equals(str[i]))
					{
						count++;
					}
				}
				if(count>1)
				System.out.println(word+ " = "+count);
			}
			
		}
	}
}