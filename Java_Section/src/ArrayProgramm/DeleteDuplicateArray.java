package ArrayProgramm;

public class DeleteDuplicateArray {

	public static void main(String[] args) {
		
		int [] arr= {5,5,7,8,9,9};
		int n=arr.length;
		
		//two loop for compare
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i]==arr[j])   //checking duplicate
				{
					for(int k=j; k<n-1; k++)//shift if found duplicate
					{
						arr[k]=arr[k+1];
					}
					n--; //ignore last shifted ele
					j--; //start compare from last shifted ele
				}
			}
		}
		
		int [] nar=new int[n];//taking new array size is n
		for(int i=0; i<n; i++)
		{
			nar[i]=arr[i]; //taking old array to new array
		}
		for(int i=0; i<nar.length; i++)
		{
			System.out.println(nar[i]);
		}
	}
	
}
