import java.util.Scanner;
public class Lab3Ex3 {
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		int sum=sumOfCube(n);
		System.out.println("sum is="+sum);
	}
		
	
   public static int sumOfCube(int n)
   {
	   int sum=0;
   
	   while(n>0)
	   {
		   int r=n%10;
		   int c=(int)Math.pow(r,3);
		   sum=sum+c;
		   n=n/10;
		   
				   
	   }
	   return sum;
   }
 }

	