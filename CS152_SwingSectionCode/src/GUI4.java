import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class GUI4 extends JFrame implements ActionListener{

	private static final int INIT_WIDTH = 400;
	private static final int INIT_HEIGHT = 300;
	JButton addButton, subButton;
	
	public GUI4() {
		setSize(INIT_WIDTH, INIT_HEIGHT);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("0");
		
		
		addButton = new JButton("Add GUI4");
		addButton.addActionListener(this);
		subButton = new JButton("Sub GUI4");
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
		if(e.getActionCommand().equals("Add GUI4"))
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
			int length = getHeight();
			addButton.setSize(width/4, length/6);
			subButton.setSize(width/4, length/6);
			addButton.setLocation(width/6, length/6);
			subButton.setLocation(7*width/12, length/6);
		}
	}
	
	public static void main(String[] args) {
		
		GUI4 window = new GUI4();
		window.setVisible(true);

	}

}
