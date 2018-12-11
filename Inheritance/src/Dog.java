
public class Dog extends Animal {
	
	private int eyes;
	private int tails;
	private int nails;

	public Dog (String name, int body, int size, int weight, String color,int eyes ,int tails,int nails) {
		super(name, body, size, weight, color);
		this.eyes=eyes;
		this.nails=nails;
		this.tails=tails;
		// TODO Auto-generated constructor stub
	}

	public void chew() {
		System.out.println("chew() called ");
		
	}
	
	
	public void bark() {
		System.out.println("bark() called ");
	}

	@Override
	public void eat() {
		chew();
		System.out.println("dog.eat() called ");
		super.eat();
	}
	
	
	
	
	
	
	
}
