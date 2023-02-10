
public class H2P54 {

	/**Manny Fomundam
	 * H2P4
	 * Figuring the amount of candy bars and gumballs that can be bought by 150 coupons	 */
	
	public final static int WC_C1 = 10;
	public final static int WC_C2 = 3;
	static int numberOfCoupons = 150;
	
	public static void main(String [] args) {
	
		int g = 0, C;
		C=(numberOfCoupons-WC_C2*g)/WC_C1;
		System.out.println(C);
		
		int c = 0, G;
		G=(numberOfCoupons-WC_C1*c)/WC_C2;
		System.out.println(G);
	}
}
