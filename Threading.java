class Multithreading extends Thread
{
	public void run()
		{
		try
		{
			System.out.println("This is"+Thread.currentThread().getId()+"Thread!");
		}
		catch (Exception e)
		{
			System.out.println("Exception occured!");
		}
	}
}
class Threading
{
	public static void main(String[] args) 
	{
		int n =6;
		for (int i=0;i<n ;i++ )
			
		{
			Multithreading a = new Multithreading();
			a.start();

		}

		
		}
}
