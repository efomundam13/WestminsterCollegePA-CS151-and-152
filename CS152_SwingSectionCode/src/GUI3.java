import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class GUI3 extends JFrame implements ActionListener{

	private JButton addButton, subButton, zeroButton;
	private JLabel valueLabel, setLabel;
	private JTextField setField;
	
	public GUI3() {
		setSize(400,300);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("0");
		
		addButton = new JButton("Add GUI3");
		addButton.addActionListener(this);
		subButton = new JButton("Sub GUI3");
		subButton.addActionListener(this);
		zeroButton = new JButton("Make GUI3 Zero");
		zeroButton.addActionListener(this);
		
		valueLabel = new JLabel("Value = 0");
		setLabel = new JLabel("Set Value");
		
		setField = new JTextField(10);
		setField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = valueLabel.getText();
				s = s.substring(0,8);
				s += setField.getText();
				valueLabel.setText(s);
				setField.setText("");
			}
		});
		setLayout(new FlowLayout());
		add(setLabel);
		add(setField);
		add(addButton);
		add(zeroButton);
		add(subButton);
		add(valueLabel);
	}
	
	public void actionPerformed(ActionEvent e) {
		String s = valueLabel.getText();
		int val = Integer.parseInt((s.substring(8)));
		s = s.substring(0,8);
		if(e.getActionCommand().equals("Add GUI3"))
			val++;
		else if(e.getActionCommand().equals("Sub GUI3"))
			val--;
		else
			val = 0;
		valueLabel.setText(s + val);
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
		
		GUI3 window = new GUI3();
		window.setVisible(true);

	}

}
