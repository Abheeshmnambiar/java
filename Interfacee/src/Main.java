import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Player kevin = new Player("kevinnnnn", 10, 15);
        System.out.println(kevin.toString());
        saveObject(kevin);

        kevin.setHitPoints(8);
        System.out.println(kevin);
        kevin.setWeapon("Stormbringer");
        saveObject(kevin);
       // loadObject(kevin);
        System.out.println(kevin);
        
        ISaveable werewolf =  new Monster("Werewolf", 20, 40);
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        saveObject(werewolf);
	}
	
	
	 


	public static ArrayList<String> readValues() {
	        ArrayList<String> values = new ArrayList<String>();

	        Scanner scanner = new Scanner(System.in);
	        boolean quit = false;
	        int index = 0;
	        System.out.println("Choose\n" +
	                "1 to enter a string\n" +
	                "0 to quit");

	        while (!quit) {
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();
	            switch (choice) {
	                case 0:
	                    quit = true;
	                    break;
	                case 1:
	                    System.out.print("Enter a string: ");
	                    String stringInput = scanner.nextLine();
	                    values.add(index, stringInput);
	                    index++;
	                    if(index==4) {
	                    quit=true;}
	                    break;
	            }
	        }
	        return values;
	    }
	
	  public static void saveObject(ISaveable objectToSave) {
	        for(int i=0; i<objectToSave.write().size(); i++) {
	            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
	        }
	    }

	    public static void loadObject(ISaveable objectToLoad) {
	        ArrayList<String> values = readValues();
	        objectToLoad.read(values);
	    }

}