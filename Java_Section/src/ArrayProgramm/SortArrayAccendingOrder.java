package ArrayProgramm;

public class SortArrayAccendingOrder {

	public static void main(String[] args) {
		int [] arr= {50,20,30,40,72};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				//if(arr[i]<arr[j]) //Descending
					if(arr[i]>arr[j])//Acceding
				{
					int temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
				}
				
			}
	
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
