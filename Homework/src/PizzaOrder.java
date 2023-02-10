
import java.util.Scanner;

public class PizzaOrder {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double totalcostoforder;
		int numofpizzas;
		
		System.out.println("How many pizzas do you want?");
		numofpizzas = in.nextInt();
		
		if (numofpizzas == 1) {
			System.out.println("Enter in info: Size, # of Cheese, # of Pepperoni, # of Ham");
			Pizza pizza1 = new Pizza(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
			System.out.println(pizza1.getDescription());
			totalcostoforder = pizza1.calcCost();
			System.out.println("Total Cost of Order: " + totalcostoforder);
		}
		else if (numofpizzas == 2) {
			System.out.println("Enter in info: Size, # of Cheese, # of Pepperoni, # of Ham");
			Pizza pizza11 = new Pizza(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
			System.out.println("Enter in info: Size, # of Cheese, # of Pepperoni, # of Ham");
			Pizza pizza22 = new Pizza(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
			System.out.println(pizza11.getDescription());
			System.out.println(pizza22.getDescription());
			totalcostoforder = pizza11.calcCost() + pizza22.calcCost();
			System.out.println("Total Cost of Order: " + totalcostoforder);
		}
		else if (numofpizzas == 3) {
			System.out.println("Enter in info: Size, # of Cheese, # of Pepperoni, # of Ham");
			Pizza pizza111 = new Pizza(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
			System.out.println("Enter in info: Size, # of Cheese, # of Pepperoni, # of Ham");
			Pizza pizza222 = new Pizza(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
			System.out.println("Enter in info: Size, # of Cheese, # of Pepperoni, # of Ham");
			Pizza pizza333 = new Pizza(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
			System.out.println(pizza111.getDescription());
			System.out.println(pizza222.getDescription());
			System.out.println(pizza333.getDescription());
			totalcostoforder = pizza111.calcCost() + pizza222.calcCost() + pizza333.calcCost();
			System.out.println("Total Cost of Order: " + totalcostoforder);
		}
		else
			System.out.println("ReEnter in 1 to 3 pizzas!!!");
	}
}
