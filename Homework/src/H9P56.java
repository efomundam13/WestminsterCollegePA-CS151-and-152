
public class H9P56 {

	/**Manny Fomundam
	 * H9P56
	 * Figuring the ideal body weight of a person that is over 5 feet.
	 */
	
	public final static double WC_C1 = 12;
	public final static double WC_C2 = 1; 
	
	public static void main(String [] args) {
		
		double a1=5.0, a2=0.0, b1=6.0, b2=3.0, H;
		H=(WC_C1*b1+WC_C2*b2)-(WC_C1*a1+WC_C2*a2);
		System.out.println(H);
		
		double BW=110+5*H;
		System.out.println(BW);	
	}
}
