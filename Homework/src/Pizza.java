
public class Pizza {
							//setting the variables
	private String size;
	private int ham, pepperoni, cheese, calcCost;
	
	public Pizza() {
		this.size = "";
		this.cheese = 0;
		this.pepperoni = 0;
		this.ham = 0;
	}
		
	public Pizza(String size, int cheese, int pepperoni, int ham) {
		this.size = size;
		this.cheese = cheese;
		this.pepperoni = pepperoni;
		this.ham = ham;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public int getHam() {
		return ham * 2;
	}
	
	public void setHam(int ham) {
		this.ham = ham;
	}
	
	public int getPeperroni() {
		return pepperoni * 2;
	}
	
	public void setPepperoni(int pepperoni) {
		this.pepperoni = pepperoni;
	}
	
	public int getCheese() {
		return cheese * 2;
	}
	
	public void setCheese(int cheese) {
		this.cheese = cheese;
	}
								//calculating costs of pizzas
	public double calcCost() {	
		if(size.equalsIgnoreCase("small")) {
			return 10 + (cheese + pepperoni + ham);
			}
		else if(size.equalsIgnoreCase("medium")) {
			return 12 + (cheese + pepperoni + ham);
			}
		else if(size.equalsIgnoreCase("large")){
			return 14 + (cheese + pepperoni + ham);
			}
		else {
			return 0.0;
		}
	}
									//making descriptions of the pizzas
	public String getDescription() {
		return "size: " + size + "\n Cheese toppings: " + cheese + "\n Pepperoni toppings: "+ pepperoni + "\n Ham toppings: " + ham + "\n Pizza cost: $" + calcCost() + "\n";
}
}

		