
public class Employee {
 private String name;
 private String id ;
 private String email;
 private String phone;
 public Employee (String name,String id,String email,String phone) {
	 this.name=name;
	 this.id =id ;
	 this.email=email;
	 this.phone =phone;
	 }
 
 public Employee() {
	String name;
	String id;
	String email;
	String phone;
}

public String getName() {
	return this.name; 
 }
 public String getId() {
	 return this.id;
	 
 }
 public String getEmail() {
	 return this.email;
	 }
 public String getPhone () {
	 return this.phone;
 }
 public void setName(String name) {
	 this.name=name; 
 }
 public void setId(String id ) {
	 this.id=id;
 }
 public void setEmail(String email) {
	 this.email=email;
 }
 public void setPhone(String phone) {
	 this.phone= phone ;
 }    
public String toString() {
	return this.name+" "+this.id +" " + this.email+" "+ this.phone ;
	 
}

}
