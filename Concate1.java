import java.util.Arrays;
class Concate1
{
	public static void main(String[] args) 
	{
		int[] sr1 = {2,3,4,98,5};
		int[] sr2 ={6,7,8};
		int size1=sr1.length;
		int size2 =sr2.length;
		sr1 = Arrays.copyOf(sr1,size1+size2);
		int j = 0;
		for (int i=size1;i<sr1.length ;i++ )
		{
			sr1[i] = sr2[j++];
		}
		Arrays.sort(sr1);
		//display elements
		for (int i:sr1 )
		{
			System.out.print(i+" ");
		}
	}
}
