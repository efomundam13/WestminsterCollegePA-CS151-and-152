import javax.swing.*;
import java.awt.event.*;

public class GUI1a extends JFrame{

	public GUI1a() {
		setSize(400,300);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("0");
		
		JButton addButton = new JButton("Add GUI1a");
		addButton.addActionListener(new ButtonListener());
		add(addButton);
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int val = Integer.parseInt(getTitle());
			val++;
			setTitle(val+"");
		}
	}
	
	public static void main(String[] args) {
		
		GUI1a window = new GUI1a();
		window.setVisible(true);

	}

}
