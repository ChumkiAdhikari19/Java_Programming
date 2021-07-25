package StringProgramm;

public class CountNoOfOccurrencesEachChar {

	public static void main(String[] args) {
		String s= "babacadadada";
		char [] arr=s.toCharArray();
		int n=arr.length;
		for(int i=0; i<arr.length; i++)
		{
			int count=1;
			for(int j=i+1; j<n; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					for(int k=j; k<n-1; k++)
					{
						arr[k]=arr[k+1];
					}
					n--;
					j--;
				}
			}
			System.out.println(arr[i] +" is occurrence "+count+ " times");
		}
	}

}
