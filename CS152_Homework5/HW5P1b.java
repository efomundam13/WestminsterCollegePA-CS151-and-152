/**Programmer: Manny Fomundam
	 * Homework 5: Problem 1b
	 * Date: 4/4/2022
	 * Modify GUI3b so that if the user presses the Shift key when clicking on either
	 * the Add or Sub button a value of 5 is added or subtracted to the counter; if the user
	 * presses the Ctrl key a value of 10 is added or subtracted to the counter; and if the user
	 * presses both the Shirt and Ctrl keys a value of 50 is added or subtracted to the counter.
       **/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HW5P1b extends JFrame implements ActionListener {

	private JButton addButton, subButton, zeroButton;
	private JLabel valueLabel, setLabel;
	private JTextField setField;
	
	public HW5P1b() {
		setSize(400,100);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("0");
		
		addButton = new JButton("Add");
		addButton.addActionListener(this);
		subButton = new JButton("Sub");
		subButton.addActionListener(this);
		zeroButton = new JButton("Zero");
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
		
		JPanel topPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		
		topPanel.setLayout(new GridLayout(1,5));
		topPanel.add(setLabel);
		topPanel.add(setField);
		topPanel.add(addButton);
		topPanel.add(zeroButton);
		topPanel.add(subButton);
		
		bottomPanel.setLayout(new FlowLayout());
		bottomPanel.add(valueLabel);
		setLayout(new GridLayout(2,1));
		add(topPanel);
		add(bottomPanel);
	}
	
	public void actionPerformed(ActionEvent e) {
		int increment = 1;
		if ((e.getModifiers() & ActionEvent.CTRL_MASK) != 0)
			increment = 10;
		if ((e.getModifiers() & ActionEvent.SHIFT_MASK) != 0)
			increment = 5;
		if ((e.getModifiers() & ActionEvent.SHIFT_MASK) != 0)
			if ((e.getModifiers() & ActionEvent.CTRL_MASK) != 0)
				increment = 50;
		
		String s = valueLabel.getText();
		int val = Integer.parseInt((s.substring(8)));
		s = s.substring(0,8);
		if(e.getActionCommand().equals("Add"))
			val += increment;
		else if(e.getActionCommand().equals("Sub"))
			val -= increment;
		else
			val = 0;
		valueLabel.setText(s + val);
	}
	
	public static void main(String[] args) {
		
		HW5P1b window = new HW5P1b();
		window.setVisible(true);

	}

}
