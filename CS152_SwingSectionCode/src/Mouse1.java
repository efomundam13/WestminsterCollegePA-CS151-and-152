import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mouse1 extends JFrame implements MouseListener {

	private static final int INIT_WIDTH = 1000;
	private static final int INIT_HEIGHT = 500;

	public Mouse1() {
		setSize(INIT_WIDTH,INIT_HEIGHT);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("0");
		addMouseListener(this);
		}

	public void mouseClicked(MouseEvent e) {
//	    int x = e.getX();
//	    int y = e.getY();
	    int x = e.getXOnScreen();
	    int y = e.getYOnScreen();
	    setTitle("Mouse Clicked (" + x + "," + y + ")");
	    }

	public void mouseEntered(MouseEvent e) {
	    int x = e.getX();
	    int y = e.getY();
	    setTitle("Mouse Entered (" + x + "," + y + ")");
	    }

	public void mouseExited(MouseEvent e) {
	    int x = e.getX();
	    int y = e.getY();
	    setTitle("Mouse Exited (" + x + "," + y + ")");
	    }

	public void mousePressed(MouseEvent e) {
	    int x = e.getX();
	    int y = e.getY();
	    setTitle("Mouse Pressed (" + x + "," + y + ")");
	    }

	public void mouseReleased(MouseEvent e) {
	    int x = e.getX();
	    int y = e.getY();
	    setTitle("Mouse Released (" + x + "," + y + ")");
	    }

	public static void main(String [] args) {
		Mouse1 window = new Mouse1();
		window.setVisible(true);
		}
	}
