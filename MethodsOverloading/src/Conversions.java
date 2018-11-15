
public class Conversions {
  public static int calcFeetAndInchesToCentimetres( double feet, double inches) {
	if (feet>=0 && ((inches>=0)&&(inches<=12))) {
           double feetToCm = 12 *2.54* feet;
           double incheToCm=2.54 * inches;
           double total= feetToCm + incheToCm;
           System.out.println( feet+"Feet and " +inches +"inches is " + total +"cm" );
           return 1;}
         else { 
        	 System.out.println("not a valid no. to convert");
        	  return -1;
          }
	}
	public static int calcFeetAndInchesToCentimetres( double inches) {
		if(inches>=0) {
			double incheToCm=2.54 * inches;
			System.out.println( inches+"inches is"+incheToCm +"cm" );
			return 1;
		}
		else {
			
		     System.out.println ("not a valid no. to convert");return -1;
		}
	}
	
  
  public static void main(String args[]) {
	  calcFeetAndInchesToCentimetres(5,5);
	  calcFeetAndInchesToCentimetres(80);
	  calcFeetAndInchesToCentimetres(-80);calcFeetAndInchesToCentimetres(-67,8);
  }
}



