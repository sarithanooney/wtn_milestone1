package arrays;
import java.util.*;

public class Arr7 {
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
	Arrays.sort(a);
	for(i=0;i<n-1;i++)
	{
	if(a[i]!=a[i+1])
	{
	b[k]=a[i];
	k++;
	}
	}
	b[k++]=a[n-1];
	for(i=0;i<k;i++)
	{
	System.out.print(b[i]+" ");
	}
	}
	}


