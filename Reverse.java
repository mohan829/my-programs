class Reverse 
{
	public static void main(String[] args) 
	{
		String str = "Hello papa";
		char[] carr = str.toCharArray();
		String rev =" ";
		for (int i=carr.length-1;i>=0 ;i-- )
		{
			rev +=carr[i];
		}
		System.out.println(rev);
	}
}
