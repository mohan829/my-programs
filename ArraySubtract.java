class ArraySubtract 
{
	public static void main(String[] args) 
	{
		int[] arr1 = {9,8,7,6};
		int[] arr2 = {0,9,8,5};

		int[] resArr = new int[arr1.length];
		for (int i=0;i<arr1.length;i++)
		{
			resArr[i] = arr1[i]-arr2[i];
		}
		for ( int ele:resArr )
		{
			System.out.print(ele+" ");
		}
	}
}
