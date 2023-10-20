class Reverse123 
{
	public static void main(String[] args) 
	{
	 int i=4,fact=1;
		do
		{
			fact = fact*i;
			i--;
		}
		while (i>=1);
		
		System.out.println(fact);
	}
}
