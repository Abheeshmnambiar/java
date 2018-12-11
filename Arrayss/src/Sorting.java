import java.util.Scanner;

public class Sorting {
	
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
	   
		int[] numbers=getInteger(5);
		
		 printArray(numbers);
		 
		 int[] sortedArray =sortArray(numbers);
		 System.out.println("sorted array is");
		 
		 for (int i=0;i<numbers.length;i++ ) {
			 System.out.println("newSortedArray["+i+"] is"+ sortedArray[i]);
			
		 }
			
		}
	   
		
		
	
	
	public static int[] getInteger(int n) {
	    System.out.println("enter the 5 numbers to be sorted");
		int[] values= new int[n];
		for (int i=0; i<values.length;i++) {
			values[i]=scanner.nextInt();
		}
		
		
		
		return values;
		
	}
	
	public static void printArray(int[] num) {
		System.out.println("the unsorted  array is \n");
		for (int i=0; i<num.length;i++) {
			System.out.println("numbers[" +i+ "] is "+ num[i]);
	
	
}

}
	
	public static int[] sortArray(int[] numbers) {
		int temp;
	    int[] sorted=new int[5];
	    boolean b=true;
	    for (int i=0;i<sorted.length;i++ ) {
	    	sorted[i]=numbers[i];
	    }
	    
	    while(b) {
	      b=false;
		for (int i=0;i<sorted.length-1;i++ ) {
			if(sorted[i]<sorted[i+1]) {
				temp=sorted[i];
				sorted[i]=sorted[i+1];
				sorted[i+1]=temp;
				b=true;
			
			}	
		}
		}
		
	    return sorted;
		
		
	}
	
}