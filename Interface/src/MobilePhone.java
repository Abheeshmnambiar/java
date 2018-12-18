
public class MobilePhone implements ITelephone {
	private int myNumber;
	boolean isRinging;
	boolean isOn=false;
	
	
	public MobilePhone(int myNumber) {
		
		this.myNumber = myNumber;
		
	}

	@Override
	public void powerOn() {
		 isOn=true;
         System.out.println("\nmobile phone is powered up ");
		
	}

	@Override
	public void dial(int phoneNumber) {
		if (isOn) {
		System.out.println("now ringing "+ phoneNumber+"on your mobilePhone" );
		}
		else {
			System.out.println("the mobilephone is switched off ");
		}
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answer the Deskphone\n");
			isRinging=false;
		}
		
	}

	@Override
	public boolean callPhone(int number) {
		if(number==myNumber && isOn) {
			isRinging=true;
			System.out.println("Melody Ring");
		}
		else {
			isRinging=false;
			 System.out.println("\nmobile phone is swited off or different number");
			}
	   return isRinging;
	}

	@Override
	public boolean isRinging() {
		
		return isRinging;
	}
	

}


