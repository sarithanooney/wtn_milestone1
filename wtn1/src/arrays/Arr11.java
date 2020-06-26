package arrays;
import java.util.*;

public class Arr11 {
	
		
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,c=0;
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		if(a[i]!=1&&a[i]!=4)
		c++;
		}
		if(c==0)
		System.out.println("True");
		else
		System.out.println("False");
		}
		}


