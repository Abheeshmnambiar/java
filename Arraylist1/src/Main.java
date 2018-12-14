import java.util.Scanner;

public class Main{
	private static Scanner scanner=new Scanner(System.in);
     
	private static GroceryList  grocerylist=new GroceryList();
	
	public static void main(String[] args) {
	
		boolean quit=false;
		int choose=0;
		printInstructions();
		
		while(!quit) {
			System.out.println("choose ur digit");
			choose=scanner.nextInt();
			scanner.nextLine();
			switch(choose) {
			  
			case 0: System.out.println("see the options");
			         printInstructions();break;
			case 1: System.out.println("list of items");
			          grocerylist.printList();break;
			
			case 2: addItem();
			        break; 
			case 3: modifylist(); 
			      break;
			case 4:remove();
			       break;
			case 5:searchitem(); break;
			
			case 6: quit=true;
			
			
			}
			
			
		}
		
	}
	
	public static  void printInstructions() {
	 System.out.println("\nPress ");
     System.out.println("\t 0 - To print choice options.");
     System.out.println("\t 1 - To print the list of grocery items.");
     System.out.println("\t 2 - To add an item to the list.");
     System.out.println("\t 3 - To modify an item in the list.");
     System.out.println("\t 4 - To remove an item from the list.");
     System.out.println("\t 5 - To search for an item in the list.");
     System.out.println("\t 6 - To quit the application.");
	}
	
	public static void addItem() {
		System.out.println("enter the item to add");
		String item=scanner.nextLine();
		grocerylist.addItem(item);
		
	}
	
	public static void modifylist() {
		
		System.out.println("enter the postion to be modified");
		int position=scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter the new item");
		String newitem=scanner.nextLine();
		grocerylist.modifyGroceryList(position-1,newitem);
		
	   
		
	}
	
	public static void remove()  {
		System.out.println("enter the position of the item to be removed");
		grocerylist.removeList(scanner.nextInt()-1);
		
	}
	
	public static void searchitem() {
		System.out.println("enter the item for the search");
		String searchItem=scanner.nextLine();
		if(grocerylist.findItem(searchItem) !=-1)
		{
			System.out.println("item is found in position"+(grocerylist.findItem(searchItem)+1));
		}
		else
			System.out.println("not found");
		
	}
	
	
	
	
	
}
