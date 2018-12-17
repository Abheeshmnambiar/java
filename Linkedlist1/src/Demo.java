import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
	
public static void main(String[] args) {
	LinkedList<String> placesToVisit=new LinkedList<String>();
	
	 addInOrder(placesToVisit, "Sydney");
     addInOrder(placesToVisit, "Melbourne");
     addInOrder(placesToVisit, "Brisbane");
     addInOrder(placesToVisit, "Perth");
     addInOrder(placesToVisit, "Canberra");
     addInOrder(placesToVisit, "Adelaide");
     addInOrder(placesToVisit, "Darwin");
     printPlaces(placesToVisit);
     
     addInOrder(placesToVisit,"Auckland");
     addInOrder(placesToVisit,"Darwin");
     printPlaces(placesToVisit);
     
     visit(placesToVisit);
}

 private static boolean addInOrder(LinkedList<String> linkedlist,String newPlace) {
	 ListIterator<String> placeslist=linkedlist.listIterator();
	 
     while(placeslist.hasNext()) {
	    int compare=placeslist.next().compareTo(newPlace);
        if(compare==0) {
    	 System.out.println(newPlace +"is the your current place");
    	 return false;
       }
   
        else if(compare>0) {
        	
            placeslist.previous();
            placeslist.add(newPlace);
            return true;
        }
            else {
            	
            }
    	 
     }
     placeslist.add(newPlace);
     return true;
 }
 
private static void printPlaces(LinkedList<String> linkedlist) {
	Iterator<String> i=linkedlist.iterator();
	while(i.hasNext()) {
		System.out.println("now visiting "+ i.next());
		
	}
    System.out.println("============================================");

}
 
private static void printMenu() {
    System.out.println("Available actions:\npress ");
    System.out.println("0 - to quit\n" +
            "1 - go to next city\n" +
            "2 - go to previous city\n" +
            "3 - print menu options");
}

private static void visit(LinkedList cities) {
	Scanner scanner=new Scanner(System.in);
	
	Boolean quit=false;
	boolean goingForward=false;
	
	ListIterator<String> list=cities.listIterator();
	
	if(cities.isEmpty()) {
		System.out.println("no cities in the itenary");
		return;
	}
	else {
		System.out.println("now visiting.." + list.next());
		printMenu();
	}
	while(!quit) {
		int input=scanner.nextInt();
		scanner.nextLine();
		
		switch(input) {
		
		case 0: System.out.println("places /vacation over");
		       
		        quit=true;break;
		
		case 1: if(!goingForward) {
			       if(list.hasNext()) {
			    	   list.next();
			       }
			      goingForward=true; 
		       }
			    if(list.hasNext()) {
			    	System.out.println("now visiting "+ list.next());
			    	
			    }
			    else {
			    	System.out.println("Reached all the places");
			    	goingForward=false;
			       }
			    break ; 
			    
		case 2:if(goingForward) {
			     if(list.hasPrevious()) {
			    	 list.previous();
			     }
			     goingForward=false;
		       }
			   if(list.hasPrevious()) {
				   System.out.println("the pervious visit "+ list.previous());
				   
			   }
			   else {
				   System.out.println("we are already at the start ");
				   goingForward=true;
			       
			       
		        } break;
		
		case 3: printMenu(); break;
		
		}
	}
	
	
	
	
	
	
	
}




}
