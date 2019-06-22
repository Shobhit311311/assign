import java.util.*;
public class SecondlARGEST {
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		
		
		int a=0;
		a=sl(A);
		System.out.println(a);
		
	}


 public static int sl(int a[])
 {
	 Arrays.sort(a);
	 
    return a[1];
 }}