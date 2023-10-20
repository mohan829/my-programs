class ArrayMultiplication
{
	public static void main(String[] args){
		int[]  arr1={1,2,3};
		int[]  arr2={3,4};
		String a = arrayToString(arr1);
		String b = arrayToString(arr2);
		long result=Integer.parseInt(a)*Integer.parseInt(b);
		System.out.println(result);
	}
	public static String arrayToString(int[] arr){
		StringBuilder sb = new StringBuilder();
		for (int num: arr )
		{
			sb.append(num);
		}
		return sb.toString();
	}
}