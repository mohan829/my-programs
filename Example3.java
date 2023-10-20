import java.util.Scanner;
class Example3
{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter cgpa");
		float cgpa = sc.nextFloat();
		float percentage =cgpa*9.5f;
		System.out.println("your percentage is :"+percentage);
	 }
}