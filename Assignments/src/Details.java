import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Details {
 public static void main(String args[] ) throws Exception {
 /* Employee emp1= new Employee ("Abeesh","E0001","abeesh@gmail.com",9976767999l);
  Employee emp2= new Employee ("Sheethal","e0002","sheethal@gmail.com",9876789879l);
  Employee emp3= new Employee ("vaishnav","E0003","vaishnav@gmail.com",9845764576l);
  Employee emp4= new Employee ("John", "E0004"  ,"john@gmail.com",9845321243l);
  Employee emp5= new Employee ("John","e0005","john12345@gmail.com",8767456351l);
  	
  System.out.println(emp1.getName());
  System.out.println(emp1.getId());
  System.out.println(emp1.getEmail());
  System.out.println(emp1.getPhone());
  
  System.out.println(emp2.getName());
  System.out.println(emp2.getId());
  System.out.println(emp2.getEmail());
  System.out.println(emp2.getPhone()); 
  
  System.out.println(emp3.getName());
  System.out.println(emp3.getId());
  System.out.println(emp3.getEmail());
  System.out.println(emp3.getPhone());
  
  System.out.println(emp4.getName());
  System.out.println(emp4.getId());
  System.out.println(emp4.getEmail());
  System.out.println(emp4.getPhone());
  
  System.out.println(emp5.getName()); 
  System.out.println(emp5.getId());
  System.out.println(emp5.getEmail());
  System.out.println(emp5.getPhone());
  */
  

 
	 List<Employee> employee = new ArrayList<>();
     employee.add(new Employee("Abeesh","E0001","abeesh@gmail.com",9976767999l)) ;
     employee.add(new Employee ("Sheethal","e0002","sheethal@gmail.com",9876789879l));
     employee.add(new Employee("vaishnav","E0001","vaishnav@gmail.com",9845764576l));  		 
     employee.add(new Employee("John", "E0004"  ,"john@gmail.com",9845321243l));  
   	 employee.add(new Employee("John","e0005","john12345@gmail.com",8767456351l));
     employee.forEach(Employee -> {
         System.out.println("Name : " + Employee.getName() + ", Id : " + Employee.getId()+",email:" + Employee.getEmail() + ",phone:" + Employee.getPhone() );
     });
      
     /*searchId("e0001",employee);     
     searchName("Sheethal",);*/
     DataInputStream dis= new DataInputStream(System.in) ;
     System.out.println("enter id or name");
     String value=dis.readLine();
     exceptionId(value,employee);
     searchValue(value,employee);
     
 }



public static void searchValue(String value,  List<Employee> emplist) {
	boolean x=false;
	
	for(Employee emp: emplist)
	{ 
		if (value.equalsIgnoreCase(emp.getId()) || (value.equals(emp.getName())))
	{	
			System.out.println("The details of the requested is \n"+ "Name="+ emp.getName() +"\n id="+ emp.getId()+"\nemail="+emp.getEmail()+"\nph="+emp.getPhone() );
	         x=true;
	}
	    
		
	};
	if (!x){
		System.out.println("invalid data");
	}
}
	

public static void exceptionId(String value, List<Employee> id) throws Exception {
	

    Set<String> empp= new HashSet<String>();
    
    for (Employee emp : id) {

        if (empp.contains(emp.getId())) {
            throw new Exception("id already exisist");
        } 
        else {
            empp.add(emp.getId());
	    
		
	
}
}
}
}

 
 
 
 
 