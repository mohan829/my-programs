class Ihub7 
{
	public static void main(String[] args) 
	{
		int[] arr={2,3,44,5,5,6,6,7,9,8,44,44,2,3,3,3,3,3};
		for (int i=0;i<arr.length ;i++ )
		{
			int cnt=0;
			for (int j=i+1;j<arr.length;j++ )
			{
				if (arr[i]==arr[j])
				{
					cnt++;
				}
			}
			if (cnt==1)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
