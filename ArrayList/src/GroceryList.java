import java.util.ArrayList;

public class GroceryList {

	private ArrayList<String> groceryList=new ArrayList<String>();
	
	
    public void addItem(String item) {
    	groceryList.add(item);    	
    	
    	
    }
    
    public void printList() {
    	System.out.println("there are "+ groceryList.size() + "items in the list ");
        
    	for(int i=0;i<groceryList.size();i++) {
    		System.out.println((i+1)+"." + groceryList.get(i));
    		
    		
    	}
    	
    	
        
    	
    }

	public void modifyGroceryList(int position, String newitem) {
		groceryList.set(position, newitem);
		System.out.println("the new item in "+ (position+1)+"is "+ groceryList.get(position));
		
	}

	public void removeList(int position) {
		String theItem= groceryList.get(position);
		
		groceryList.remove(theItem);
		System.out.println("the item is removed");
		
	}

	public int findItem(String searchItem) {
		int pos=groceryList.indexOf(searchItem);
		
		if(pos>=0) {
			return pos;
		}
		return -1;
	}
	
	 
}
