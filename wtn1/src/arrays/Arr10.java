package arrays;
import java.util.*;

public class Arr10 {
	
	private static Scanner sc;
	public static void main(String[] args)
	{
	sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	int[] b=new int[n];
	int i,k=0;
	for(i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
	if(a[i]%2==0)
	{
	b[k]=a[i];
	k++;
	}
	}
	for(i=0;i<n;i++)
	{
	if(a[i]%2!=0)
	{
	b[k]=a[i];
	k++;
	}
	}
	for(i=0;i<n;i++)
	{
	System.out.print(b[i]+" ");
	}
	}
	}


