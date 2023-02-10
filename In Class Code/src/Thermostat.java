
public class Thermostat {

	private double temp;
	private boolean isFahr;
	
	public Thermostat(double temp, boolean isFahrenheit) {
		this.temp = temp;
		isFahr = isFahrenheit;
	}
	
	public Thermostat(double temp) {
		this.temp = temp;
		isFahr = true;
		// or
		// this(temp, true);
	}
	
	public double getTemp() {
		if (isFahr)
			return temp;
		else
			return (temp-32.0) * 5.0/9.0;
	}
	
	public boolean getIsFahr() {
		return isFahr;
	}
	
	public boolean getIsCelcius() {
		return isFahr;
	}
	
	public void setTemp(double t) {
		if (isFahr)
			this.temp = t;
		else
			this.temp = t*5.0/9.0 + 32;
	}
	
	public void setIsFahr() {
		isFahr = true;
	}
	
	public void setIsCelcuis() {
		isFahr = false;
	}
	
	public static void main(String [] args ) {
		Thermostat t = new Thermostat(72, true);
		
		System.out.println("Current temperature in Fahrenheit = " + t.getTemp());
		t.setIsCelcuis();
		System.out.println("Current tempertaure in Calcuis = " + t.getTemp());
	}
	}


