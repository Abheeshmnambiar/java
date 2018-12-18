
public class DeskPhone implements ITelephone{

	private int myNumber;
	boolean isRinging;
	
	
	
	public DeskPhone(int myNumber) {
		
		this.myNumber = myNumber;
		
	}

	@Override
	public void powerOn() {
         System.out.println("no actions were taken ,there is no power button on Deskphones ");
		
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("now ringing "+ phoneNumber+"on your Deskphone" );
		
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.print("Answer the Deskphone");
			isRinging=false;
		}
		
	}

	@Override
	public boolean callPhone(int number) {
		if(number==myNumber) {
			isRinging=true;
			System.out.println("Ring Ring");
		}
		else {
			System.out.println("different no.");
			isRinging=false;
			}
	   return isRinging;
	}

	@Override
	public boolean isRinging() {
		
		return isRinging;
	}
	

}
