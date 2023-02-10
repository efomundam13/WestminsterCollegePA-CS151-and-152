import javax.swing.*;

public class Second2 extends JFrame{

	public Second2() {
		setSize(800,500);
		setLocation(200,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String title = JOptionPane.showInputDialog("Enter window title");
		setTitle(title);
	}
	public static void main(String[] args) {
		
		Second2 frame = new Second2();
		frame.setVisible(true);

	}

}
