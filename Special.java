class Special 
{
	public static void main(String[] args) 
	{
		String str = "Ihub@Tal#@$nt";
		str= str.replaceAll("[^A-Za-z0-9]","");
		System.out.println(str);

	}
}
