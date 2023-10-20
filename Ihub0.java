class Ihub0 
{
	public static void main(String[] args) 
	{
		int[] arr1 = {80,21,3,1};
		int[] arr2 = {8,7,10,15};
		int[] resArr = new int[arr1.length];
		for (int i=0;i<arr1.length ;i++ )
		{
			resArr[i] = arr1[i]%arr2[i];
		}
			int sum=0;
			for (int ele:resArr)
			{
				
				sum+=ele;
			}
			System.out.println(sum);
	}
}
