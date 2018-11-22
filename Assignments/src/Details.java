import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.HashSet;

public class Details {
 
 
  

 
	
static
{
		 

		 HashMap<String, Employee>map = new HashMap();

		 


		 try {

		 String fileName="C:\\office\\emp1.properties";
		 Properties prop = new Properties();
		 FileInputStream fileInput = new FileInputStream(fileName);
		 prop.load(fileInput);



		// Employee E = new Employee();
		 Employee emp1=new Employee(prop.getProperty("emp1.name"),prop.getProperty("emp1.id"),prop.getProperty("emp1.email"),prop.getProperty("emp1.phone"));
		 Employee emp2=new Employee(prop.getProperty("emp2.name"),prop.getProperty("emp2.id"),prop.getProperty("emp2.email"),prop.getProperty("emp2.phone"));
		 Employee emp3=new Employee(prop.getProperty("emp3.name"),prop.getProperty("emp3.id"),prop.getProperty("emp3.email"),prop.getProperty("emp3.phone"));
		 Employee emp4=new Employee(prop.getProperty("emp4.name"),prop.getProperty("emp4.id"),prop.getProperty("emp4.email"),prop.getProperty("emp4.phone"));
		 Employee emp5=new Employee(prop.getProperty("emp5.name"),prop.getProperty("emp5.id"),prop.getProperty("emp5.email"),prop.getProperty("emp5.phone"));
		 
		 
		 
		map.put(prop.getProperty("emp1.id"),emp1)  ;
		map.put(prop.getProperty("emp2.id"),emp2)  ;
		map.put(prop.getProperty("emp3.id"),emp3)  ;
		map.put(prop.getProperty("emp4.id"),emp4)  ;
		map.put(prop.getProperty("emp5.id"),emp5)  ;
		 
		 

		 System.out.println(map);


		 }
		 catch(FileNotFoundException e){

		 e.printStackTrace();

		 }
		 

		 catch(IOException e) {
		 e.printStackTrace();
		 }

		 search(map);
		 
}


		 

		


public static void search(HashMap<String,Employee>map) {
		Scanner scnr=new Scanner (System.in);  
		System.out.println("enter name or id ");
		String idOrName =scnr.nextLine();
		
		for(Map.Entry<String,Employee>entry:map.entrySet()) {
			String key= entry.getKey();
			Employee value=entry.getValue();
			
			if (idOrName.equalsIgnoreCase(key) || idOrName.equalsIgnoreCase(value.getName())) {
				System.out.println(map.get(key));
			}
		} 
}


public static void main(String args[]) throws IOException {
	
}
 
} 
 

















