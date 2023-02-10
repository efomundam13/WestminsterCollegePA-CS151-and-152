/**Programmer: Manny Fomundam
	 * Homework 5: Problem 4
	 * Date: 4/4/2022
	 * Write a Swing program that displays a calculator layout
	 **/

import java.awt.*;
import java.awt.event.*;
import java.util.IllegalFormatException;

import javax.swing.*;

public class HW5P4 extends JFrame implements ActionListener {
	
		private JLabel display;
		private JPanel numPanel, biOpPanel, unaryOpPanel, opPanel;
		private Font displayFont;
		private JButton [] numButtons = new JButton[12];
		private JButton [] biOpButtons = new JButton[5];
		private JButton [] unaryOpButtons = new JButton[7];

		private double runningVal=0.0;
		private String currVal = "0";
		private String prevOp="+";
		private boolean newVal = true;

		class BinaryOpListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			/*
			 * handles binary operator panel button events
			 */
			{
				String op = e.getActionCommand();
				newVal = true;
				double curr = Double.parseDouble(currVal);	// get current value displayed
				if (!prevOp.equals("=")) {
					switch (prevOp) {						// and modify it based on previous op
					case "+" :
						curr = runningVal + curr;
						break;
					case "-" :
						curr = runningVal - curr;
						break;
					case "*" :
						curr = runningVal * curr;
						break;
					case "/" :
						curr = runningVal / curr;
						break;
					}
				}

				if (!op.equals("=")) {
					runningVal = curr;
					prevOp = op;
				}
				else {						// calculation is over when = pressed so
					runningVal = 0.0;		//   set runningVal to 0
					prevOp = "";
				}
				displayVal(curr);
			}
		}
		
		class unaryOpListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				String op = e.getActionCommand();
				newVal = true;
				double curr = Double.parseDouble(currVal);
				if (!prevOp.equals("=")) {
					switch (prevOp) {
					case "x^2" :
						curr = curr * curr;
						break;
					case "\u221A" :
						curr = Math.sqrt(curr);
						break;
					case "1/x" :
						if(runningVal > 0) {
							curr = 1 / curr;
						}
						else {
							display.setText("Error");
						}
						break;
					case "CE" :
						curr = 0;
						break;
					case "C" :
						curr = 0;
						runningVal = 0;
						break;
					case "x^3" :
						curr = curr * curr * curr;
						break;
					case "|x|" :
						curr = Math.abs(curr);
						break;
						}
					}
				
				if (!op.equals("=")) {
					runningVal = curr;
					prevOp = op;
				}
				else {						// calculation is over when = pressed so
					runningVal = 0.0;		//   set runningVal to 0
					prevOp = "";
				}
				displayVal(curr);
			}
		}

		public HW5P4() {
			setSize(300,400);
			setLocation(200,200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Calculator");
														// set up numbers panel
			numPanel = new JPanel();
			numPanel.setLayout(new GridLayout(4,3));
			for(int i=1; i<=9; i++)
				numButtons[i-1] = new JButton(""+i);
			numButtons[9] = new JButton("+/-");
			numButtons[10] = new JButton("0");
			numButtons[11] = new JButton(".");
			for(int i=0; i<numButtons.length; i++) {
				numPanel.add(numButtons[i]);
				numButtons[i].addActionListener(this);
			}
			
			unaryOpPanel = new JPanel();
			unaryOpPanel.setLayout(new GridLayout(7,1));
			unaryOpButtons[0] = new JButton("x^2");
			unaryOpButtons[1] = new JButton("\u221A");
			unaryOpButtons[2] = new JButton("1/x");
			unaryOpButtons[3] = new JButton("CE");
			unaryOpButtons[4] = new JButton("C");
			unaryOpButtons[5] = new JButton("x^3");
			unaryOpButtons[6] = new JButton("|x|");
			unaryOpListener unaryOpListener = new unaryOpListener();
			for(int i=0; i<unaryOpButtons.length; i++) {
				unaryOpPanel.add(unaryOpButtons[i]);
				unaryOpButtons[i].addActionListener(unaryOpListener);
			}
			
														// set up binary op panel
			biOpPanel = new JPanel();
			biOpPanel.setLayout(new GridLayout(5,1));
			biOpButtons[0] = new JButton("/");
			biOpButtons[1] = new JButton("*");
			biOpButtons[2] = new JButton("-");
			biOpButtons[3] = new JButton("+");
			biOpButtons[4] = new JButton("=");
			BinaryOpListener biOpListener = new BinaryOpListener();
			for(int i=0; i<biOpButtons.length; i++) {
				biOpPanel.add(biOpButtons[i]);
				biOpButtons[i].addActionListener(biOpListener);
			}
			
			opPanel = new JPanel();
			opPanel.setLayout(new GridLayout(1,2));
			opPanel.add(biOpPanel);
			opPanel.add(unaryOpPanel);
														// set up display panel
			display = new JLabel("0");
			displayFont = new Font("Times Roman", Font.PLAIN, 16);
			display.setFont(displayFont);
			display.setHorizontalAlignment(SwingConstants.RIGHT);
			display.setPreferredSize(new Dimension(200,20));
														// place panels in JFrame
			setLayout(new BorderLayout());
			add(display, BorderLayout.NORTH);
			add(numPanel, BorderLayout.CENTER);
			add(opPanel, BorderLayout.EAST);
		}

		public void actionPerformed(ActionEvent e) {
			String val = e.getActionCommand();
			if (newVal) {							// if start of new value, ignore
				currVal = "0";						//   what's currently in display
				newVal = false;
			}
			else
				currVal = display.getText();		// otherwise add on to it
			if (val.equals("+/-")) {
				if (currVal.charAt(0) == '-')
					currVal = currVal.substring(1);
				else
					currVal = "-" + currVal;
			}
			else {
				if (currVal.equals("0") && !val.equals("."))	// remove leading 0's if
					currVal = "";								//   the value is an integer
				currVal += e.getActionCommand();
			}
			display.setText(currVal);
		}

		private void displayVal(double val) {
			if ((int)val == val)					// check if val contains an integer value
				currVal = "" + (int)val;			//   to avoid display enting in ".0"
			else
				currVal = "" + val;
			display.setText(currVal);
		}

		public static void main(String[] args) {

			HW5P4 calc = new HW5P4();
			calc.setVisible(true);
		}
	}
