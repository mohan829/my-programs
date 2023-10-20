class Diagonalelements
{
	public static void main(String[] args){
		int[][] arr = {
						{4,5,6},{7,8,9},{10,25,1}
			
				
						};
			//logic
			int sum = 0;
			for (int i=0;i<3 ;i++ )
			{
				for (int j=0;j<3 ;j++ )
				{
					if (i==j)
					{
						sum = sum+arr[i][j];
					}
				}
			}
			System.out.println("the sum of the diagonal elements are:"+sum);
	}
}