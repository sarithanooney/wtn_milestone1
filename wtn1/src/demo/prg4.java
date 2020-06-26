package demo;

public class prg4 {
	
	public static void main(String args[]) {
        int a;
        a=Integer.parseInt(args[0]);
        if(a>0)
        {
            System.out.println("positive number");
        }
        else if(a<0)
        {
            System.out.println("negative number");
        }
        else
        {
            System.out.println("zero");
        }
    }

}
