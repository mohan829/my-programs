class RemainderArray 
{
	public static void main(String[] args) 
	{
		int[] arr1 = {10,20,30,40};
		int[] arr2 ={3,5,7,4};
		
		int[] resArr = new int[arr1.length];
		for (int i=0;i<arr1.length ;i++ )
		{
			resArr[i] = arr1[i] % arr2[i];
		}
		System.out.println("Array1 Elements are:");
		printArray(arr1);
		System.out.println("Array2 Elements are:");
		printArray(arr2);
		System.out.println("Array3 Elements are:");
		 printArray(resArr);
	}
		
		public static void printArray(int[] resArr){
			for (int i=0;i<resArr.length ;i++ )
			{
				System.out.print(resArr[i]+" ");
				
			}
			System.out.println();
		}
}
