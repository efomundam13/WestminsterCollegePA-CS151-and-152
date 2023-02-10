import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI2 extends JFrame{

	public GUI2() {
		setSize(400,300);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("0");
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val = Integer.parseInt(getTitle());
				val++;
				setTitle(val+"");
			}
		});
		JButton subButton = new JButton("Sub");
		subButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val = Integer.parseInt(getTitle());
				val--;
				setTitle(val+"");
			}
		});
		// setLayout(new GridLayout(1,2));
		// setLayout(new FlowLayout());
		// setLayout(null);
		// addButton.setSize(100,50);
		// subButton.setSize(100,50);
		//addButton.setLocation(50,50);
		// subButton.setLocation(250,50);
		setLayout(new BorderLayout());
		add(addButton, BorderLayout.NORTH);
		add(subButton, BorderLayout.WEST);
	}
	
	public static void main(String[] args) {
		
		GUI2 window = new GUI2();
		window.setVisible(true);

	}

}
