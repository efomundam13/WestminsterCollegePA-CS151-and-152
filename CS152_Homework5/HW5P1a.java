/**Programmer: Manny Fomundam
	 * Homework 5: Problem 1b
	 * Date: 4/4/2022
	 * Modify the GUI3b.java program we wrote in class so that the 
	 * JTextField component uses the GUI3b object as its action listener
	 **/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HW5P1a extends JFrame implements ActionListener{

	private JButton addButton, subButton, zeroButton;
	private JLabel valueLabel, setLabel;
	private JTextField setField;
	
	public HW5P1a() {
		setSize(400,100);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("0");
		
		addButton = new JButton("Add");
		addButton.addActionListener(this);;
		subButton = new JButton("Sub");
		subButton.addActionListener(this);
		zeroButton = new JButton("Zero");
		zeroButton.addActionListener(this);
		setField = new JTextField(10);
		setField.addActionListener(this);
		
		valueLabel = new JLabel("Value = 0");
		setLabel = new JLabel("Set Value");
		
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
		
		add(setField, BorderLayout.NORTH);
	}
	
	public void actionPerformed(ActionEvent e) {
		String s = valueLabel.getText();
		int val = Integer.parseInt((s.substring(8)));
		s = s.substring(0,8);
	
		
		if(e.getActionCommand().equals("Add"))
			val++;
		else if(e.getActionCommand().equals("Sub"))
			val--;
		else if(e.getActionCommand().equals("Zero"))
			val = 0;
		else {
			String sTwo = setField.getText();
			val = Integer.parseInt((sTwo));
			sTwo += setField.getText();
			setField.setText("");
		}
		
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
		HW5P1a window = new HW5P1a();
		window.setVisible(true);
	}
}