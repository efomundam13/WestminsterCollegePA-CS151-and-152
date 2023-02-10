import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class GUI2b extends JFrame implements ActionListener{

	JButton addButton, subButton;
	public GUI2b() {
		setSize(400,300);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("0");
		
		addButton = new JButton("Add GUI2b");
		addButton.addActionListener(this);
		subButton = new JButton("Sub GUI2b");
		subButton.addActionListener(this);
		setLayout(new FlowLayout());
		add(addButton);
		add(subButton);
	}
	
	public void actionPerformed(ActionEvent e) {
		int val = Integer.parseInt(getTitle());
		if(e.getActionCommand().equals("Add GUI2b"))
			val++;
		else
			val--;
	/*
		JButton clickedButton = (JButton)e.getSource();
		if(clickedButton == addButton)
			val++;
		else
			val--;
	*/
		setTitle(val+"");
	}
	
	public static void main(String[] args) {
		
		GUI2b window = new GUI2b();
		window.setVisible(true);

	}

}
