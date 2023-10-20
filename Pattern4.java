class Pattern4 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=4;i++)
		{
			
			for (int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			for (int m=1;m<=(4-i)*2;m++)
			{
				System.out.print("");
				  for (int j=1;j>=i;j--)
			  {
					System.out.print(i+" ");
			  }

			}
			
			System.out.println(" ");
		}
	}
}
