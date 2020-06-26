package arrays;
import java.util.*;

public class Arr12 {
	
		private static Scanner sc;
		public static void main(String[] args)
		{
		sc=new Scanner(System.in);
		int[] a=new int[3];
		int[] b=new int[3];
		int i;
		for(i=0;i<3;i++)
		{
		a[i]=sc.nextInt();
		}
		for(i=0;i<3;i++)
		{
		b[i]=sc.nextInt();
		}
		int[] c=new int[2];
		c[0]=a[1];
		c[1]=b[1];
		for(i=0;i<2;i++)
		System.out.print(c[i]+" ");
		}
		}



