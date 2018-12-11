
public class Animal {

	private String name;
	private int body;
	private int size ;
	private int weight;
	private String color;
	
	
	

	
	


	public Animal(String name, int body, int size, int weight, String color) {
		
		this.name = name;
		this.body = body;
		this.size = size;
		this.weight = weight;
		this.color = color;
	}
	
	
	
    public void eat() {
	 System.out.println("animal.eat() called");
    }
    
    
	public void move() {
		System.out.println("animal.move() called");
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBody() {
		return body;
	}
	public void setBody(int body) {
		this.body = body;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
