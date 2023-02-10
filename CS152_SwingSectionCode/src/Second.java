import javax.swing.*;
public class Second {

	public static void main(String[] args) {
	
		JFrame frame = new JFrame();
		
		frame.setSize(800,600);
		frame.setLocation(500,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		String title = JOptionPane.showInputDialog("Enter Widnow Title");
		frame.setTitle(title);
		JOptionPane.showMessageDialog(frame, "Success!");
	}

}
