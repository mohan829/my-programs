class RemainderArray1 
{
	public static void main(String[] args) 
	{
		int[] arr1 = {10,20,30,40};
		int[] arr2 = {3,3,5,6};

		int[] resArr = new int[arr1.length];
		for (int i=0;i<arr1.length ;i++ )
		{
			resArr[i] = arr1[i] % arr2[i];

		}
			for ( int ele:resArr )
			{
				System.out.println("The third Array Elements are:"+ele+" ");
			}
	}
}
