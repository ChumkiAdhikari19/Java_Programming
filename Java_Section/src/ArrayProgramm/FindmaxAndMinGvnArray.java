package ArrayProgramm;

public class FindmaxAndMinGvnArray {

	public static void main(String[] args) {
		int [] arr= {50,20,90,30,40,72};
		
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
		System.out.println("min = "+arr[0]);
		System.out.println("max = "+arr[arr.length-1]);
	}

}
