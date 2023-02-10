/**Programmer: Manny Fomundam
	 * Homework 5: Problem 1a
	 * Date: 4/4/2022
	 * Modify the GUI4.java so that the two buttons are always
	 * centered height-wise in the JFrame as the window is resized.
	 **/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HW5P2 extends JFrame implements ActionListener{

	private static final int INIT_WIDTH = 400;
	private static final int INIT_HEIGHT = 300;
	JButton addButton, subButton;
	
	public HW5P2() {
		setSize(INIT_WIDTH, INIT_HEIGHT);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("HW4P2 GUI");
		
		addButton = new JButton("Add");
		addButton.addActionListener(this);
		subButton = new JButton("Sub");
		subButton.addActionListener(this);
		setLayout(null);
		addButton.setSize(INIT_WIDTH/4, INIT_HEIGHT/6);
		subButton.setSize(INIT_WIDTH/4, INIT_HEIGHT/6);
		addButton.setLocation(INIT_WIDTH/6, INIT_HEIGHT/6);
		subButton.setLocation(7*INIT_WIDTH/12, INIT_HEIGHT/6);
		add(addButton);
		add(subButton);
		addComponentListener(new Resizer());
	}
	
	public void actionPerformed(ActionEvent e) {
		int val = Integer.parseInt(getTitle());
		if(e.getActionCommand().equals("Add"))
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
	
	private class Resizer extends ComponentAdapter {
		public void componentResized(ComponentEvent e) {
			int width = getWidth();
			int height = getHeight();
			addButton.setSize(width/4, height/6);
			subButton.setSize(width/4, height/6);
			addButton.setLocation(width/6, 4*height/12);
			subButton.setLocation(7*width/12, 4*height/12);
		}
	}
	
	public static void main(String[] args) {
		
		HW5P2 window = new HW5P2();
		window.setVisible(true);
	}

}
