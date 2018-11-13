
public class UsingMethods {

	public static void main(String [] arg) {
		
		checkSum(80,30,200,true);
		
		
		checkSum(1000,400,550,true);
	}
  public static void checkSum(int a,int b ,int c, boolean x) {
	  if (x==true)
		{
			int sum= a + (c * b);
			sum +=sum;
			System.out.println("total sum is " + sum);
		}
  }
		
}
