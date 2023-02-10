import javax.swing.*;
import java.awt.event.*;

public class GUI1c extends JFrame implements ActionListener{

	public GUI1c() {
		setSize(400,300);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("0");
		
		JButton addButton = new JButton("Add GUI1c");
		addButton.addActionListener(this);
		add(addButton);
	}
	
	public void actionPerformed(ActionEvent e) {
		int val = Integer.parseInt(getTitle());
		val++;
		setTitle(val+"");
	}
	
	public static void main(String[] args) {
		
		GUI1c window = new GUI1c();
		window.setVisible(true);

	}

}
