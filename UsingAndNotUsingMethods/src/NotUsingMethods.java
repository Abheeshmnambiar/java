
public class NotUsingMethods {

	public static void main(String [] args) {
		int a=80;
		int b=30;
		int c=200;
		boolean x=true;
		if (x==true)
		{
			int sum= a + (c * b);
			sum +=sum;
			System.out.println("total sum is " + sum);
		}
	    a=1000;
	    b=400;
		c=550;
		x=true;
		if (x==true)
		{
			int sum= a + (c * b);
			sum += sum;
			System.out.println("total sum is " + sum);
		}
	   
	
	
	}
}
