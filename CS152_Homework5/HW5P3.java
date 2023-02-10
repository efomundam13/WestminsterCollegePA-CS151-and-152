/**Programmer: Manny Fomundam
	 * Homework 5: Problem 3
	 * Date: 4/4/2022
	 * Write a simple program that displays two JTextFields labeled as Miles and
	   Kilometers and correctly sets the value of any one field when the other 
	   field’s value is changed by the user
	 **/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HW5P3 extends JFrame {

	private JLabel milesLabel, kilometersLabel;
	private JTextField milesField, kilometersField;
	
	public HW5P3() {
		setSize(500, 500);
		setLocation(250,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Miles/Kilometer Converter");
		
		milesLabel = new JLabel("Miles");
		milesField = new JTextField(10);
		milesField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = milesField.getText();
				Double val = Double.parseDouble(s);
				kilometersField.setText(Double.toString(val * 1.609344));
			}
		});
		
		kilometersLabel = new JLabel("Kilometers");
		kilometersField = new JTextField(10);
		kilometersField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = kilometersField.getText();
				Double val = Double.parseDouble(s);
				milesField.setText(Double.toString(val * 0.621371));
			}
		});
		
		JPanel topPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		
		topPanel.setLayout(new GridLayout(2,1));
		topPanel.add(milesLabel);
		topPanel.add(milesField);
		
		bottomPanel.setLayout(new GridLayout(2,1));
		topPanel.add(kilometersLabel);
		topPanel.add(kilometersField);
		
		setLayout(new GridLayout(2,1));
		add(topPanel);
		add(bottomPanel);
	}
	
		public static void main(String[] args) {
			HW5P3 window = new HW5P3();
			window.setVisible(true);
		}
	}

