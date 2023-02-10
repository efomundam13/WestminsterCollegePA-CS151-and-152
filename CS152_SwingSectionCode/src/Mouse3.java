import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.*;

public class Mouse3 extends JFrame {

	private ArrayList<Point> points = new ArrayList<>();
	public Mouse3() {
		setSize(1000,500);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Mouse example");
		add(new LinePanel());
	}
	
	private class LinePanel extends JPanel {
		public LinePanel() {
			addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					points.add(e.getPoint());
					repaint();
				}
			});
		}
		
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(int i = 0; i < points.size()-1; i+=2) {
			Point p1 = points.get(i);
			Point p2 = points.get(i+1);
			int x = Math.min(p1.x,  p2.x);
			int y = Math.min(p1.x, p2.y);
			int width = Math.abs(p1.x-p2.x);
			int height = Math.abs(p1.y-p2.y);
			g.drawRect(x, y, width, height);
			//g.drawLine(p1.x, p1.y, p2.x, p2.y);
		}
	}
	
	public static void main(String[] args) {
		
		Mouse3 window = new Mouse3();
		window.setVisible(true);

	}
	}
}
