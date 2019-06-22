import java.util.Arrays;
import java.util.Scanner;

public class Lab3Ex2 {
	public static void main(String[] args)
	{
	System.out.println(" enter n");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String[] myArray=new String[n];
	int k=myArray.length;
	for(int i=0;i<k;i++)
	{
	 myArray[i]=sc.next();
	}
	upl(myArray);
	for(int i=0;i<k;i++)
	{
	
	System.out.println(myArray[i]);
	
	}
	}

	private static String[] upl(String[] myArray) {
		Arrays.sort(myArray);
        int h=myArray.length;
        if(h%2!=0)
        {
        for(int i=0;i<h/2+1;i++)
        {
        	
        	myArray[i]=myArray[i].toUpperCase();
        	myArray[i+(h/2)]=myArray[i+(h/2)].toLowerCase();
       	
        }
        
        myArray[h/2]= myArray[h/2].toUpperCase();
        }
        else
        {
        	 for(int i=0;i<h/2+1;i++)
        	 {
        	myArray[i]=myArray[i].toUpperCase();
        	myArray[i+(h/2)]=myArray[i+(h/2)].toLowerCase();
        }
        }
        return myArray;
	}
        
                
        
		
	

}
