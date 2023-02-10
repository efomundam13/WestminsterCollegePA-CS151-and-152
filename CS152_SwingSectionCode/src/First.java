import javax.swing.*;

public class First {

	public static void main(String[] args) {
		
		double f_temp, c_temp;

		String s = JOptionPane.showInputDialog("Enter a temperature in Fahrenheit");
		f_temp = Double.parseDouble(s);
		c_temp = (f_temp - 32) * 5.0/9.0;
		JOptionPane.showMessageDialog(null, "Celcius temperature = " + c_temp, "FtoC Coversion", JOptionPane.WARNING_MESSAGE);
	}

}
