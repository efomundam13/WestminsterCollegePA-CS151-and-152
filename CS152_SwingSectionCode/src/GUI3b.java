import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI3b extends JFrame implements ActionListener{

	private JButton addButton, subButton, zeroButton;
	private JLabel valueLabel, setLabel;
	private JTextField setField;
	
	public GUI3b() {
		setSize(400,100);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("0");
		
		addButton = new JButton("Add GUI3b");
		addButton.addActionListener(this);
		subButton = new JButton("Sub GUI3b");
		subButton.addActionListener(this);
		zeroButton = new JButton("Make GUI3b Zero");
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
		
		add(setField, BorderLayout.NORTH);
	}
	
	public void actionPerformed(ActionEvent e) {
		String s = valueLabel.getText();
		int val = Integer.parseInt((s.substring(8)));
		s = s.substring(0,8);
		if(e.getActionCommand().equals("Add GUI3b"))
			val++;
		else if(e.getActionCommand().equals("Sub GUI3b"))
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
		
		GUI3b window = new GUI3b();
		window.setVisible(true);

	}

}
