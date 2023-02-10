
public class Windchill {

	/**Manny Fomundam
	 * Lab 2: Windchill
	 * a program which stores a temperature (in Fahrenheit) and wind speed in two separate vari-, calculates the windchill in a third variable, and then outputs the windchill in both Fahrenheit and Celsiu
	 */
	
	public static final double WC_C1 = 35.74;
	public static final double WC_C2= 0.6215;
	public static final double WC_C3 = 35.75;
	public static final double WC_C4 = 0.4275;
	public static final double WC_C5 = 0;

	public static void main(String[] args) {

		double t=50, v=5.0, w;

		w=WC_C1+WC_C2*t-WC_C3*Math.pow(v, .16)+WC_C4*Math.pow(t, 1)*Math.pow(v, .16);

		System.out.println(w);

		double Wc=(w-32)*5.0/9.0;
		
		System.out.println(Wc);
	}
}
