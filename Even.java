class Even 
{
	public static void main(String[] args) 
	{
		int[] arr = {7,9,5,12,11,27,13};
		for (int i=0;i<arr.length ;i++ )
		{
			boolean flag = true;
			for (int j=2;j<=arr[i]/2;j++ )
			{
				if(arr[i]%j==0)
				{
					flag = false;
					break;
				}
			}
			if(flag==true)
				break;
			else
				 System.out.print(arr[i]+" ");
		}
	}
}
