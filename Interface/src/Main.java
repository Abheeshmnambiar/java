
public class Main {

	public static void main(String[] args) {
		ITelephone timsPhone;
		timsPhone =new DeskPhone(123456);
		
		timsPhone.powerOn();
		timsPhone.dial(74744747);
		timsPhone.callPhone(1234561);
	    timsPhone.answer();
	    
	    timsPhone=new MobilePhone(242424);
	    timsPhone.powerOn();
	    timsPhone.dial(988765);
	    timsPhone.callPhone(2424241);
	    timsPhone.answer();
	    
	    
	    
	    
	    
	}
}
