 public class Pattern3 
{
	public static void main(String[] args) 
	{   
		int n=5;
				//rows
		for(int i=1;i<=n;i++)
		{
			//increasing order
			for (int j=1;j<=n ;j++)
			{
				System.out.print(j+" ");
			}
			//space
			for (int k=1;k<=2*(n-i);k++ )
			{
				System.out.print(" ");
			}
			//decreasing order
			for (int j=i;j>=i ;j-- )
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		
	  }
	}
}
