public class ArrayMultiplication1
{
	public static void main(String[] args) 
	{
		int[] arr1 = {2,4,6,8,10};
		int[] arr2 ={1,3,5,7,9};

		int[] resArr = new int[arr1.length];
		for (int i=0;i<arr1.length;i++ )
		{
			resArr[i] = arr1[i]*arr2[i];

		}
		for (int ele:resArr)
		{
			System.out.print(ele+" ");
		}

	}
}
