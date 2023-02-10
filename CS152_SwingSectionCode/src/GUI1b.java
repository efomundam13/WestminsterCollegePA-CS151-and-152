import javax.swing.*;
import java.awt.event.*;

public class GUI1b extends JFrame{

	public GUI1b() {
		setSize(400,300);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("0");
		
		JButton addButton = new JButton("Add GUI1b");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val = Integer.parseInt(getTitle());
				val++;
				setTitle(val+"");
			}
		});
		add(addButton);
	}
	
	public static void main(String[] args) {
		
		GUI1b window = new GUI1b();
		window.setVisible(true);

	}

}
