import java.text.DecimalFormat;
class Formating 
{
	public static void main(String[] args) 
	{
		double x =12;
		 System.out.printf( " \n The number is : %f \n ", x ) ;      
		 // printing only the numeric part of the floating number  
			 DecimalFormat ft = new DecimalFormat( " #### " ) ;  
			 System.out.println( " \n Without fraction part the number is : " + ft.format( x ) ) ;  
			 ft = new DecimalFormat( " 000 " ) ;  
				System.out.println( " \n Appending the zeroes to the left of the number = "+ ft.format( x ) ) ; 
				String str1 = String.format("%15d",12);
				 System.out.println(str1);

	}
}
