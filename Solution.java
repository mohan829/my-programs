import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a=in.nextInt();
		System.out.println("Enter the value of b:");
		int b=in.nextInt();
		System.out.println("Enter the value of n:");
		int n=in.nextInt();
        //for(int i=0;i<t;i++){
          //  int a = in.nextInt();
            //int b = in.nextInt();
            //int n = in.nextInt();
        //}
        in.close();
		
       do
       {
		   System.out.println(a+b*n);
		   n++;
       }
       while (n<10);
			

        
    }
}
