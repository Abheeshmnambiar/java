	import java.lang.ArrayIndexOutOfBoundsException;
	import java.util.Scanner;

	public class ArrayTest {

		
			
			private static Scanner scanner=new Scanner(System.in);
			
			public static void main(String[] args) {
				
			int[] intArray=getIntegers(5);
			for (int i=0;i<intArray.length;i++) {
				System.out.println("intArray[" + i +"] is"+ intArray[i]);
			}
			System.out.println("average is " + getAverage(intArray));  
			
			}
			
			public static int[] getIntegers(int number) {
				System.out.println("enter the array integers \r");
				int[] values=new int[number];
				for(int i=0;i<values.length;i++) {
					values[i]=scanner.nextInt();
				}
			   return values;
			
			
			}
			public static double getAverage(int[] array) {
				double sum=0;
				for(int i=0;i<array.length;i++) {
				sum+=array[i];	
					
				}
				
				
				return sum/array.length;
			}
			
			
			
		
	}



