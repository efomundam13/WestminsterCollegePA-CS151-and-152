
/**Programmer: Manny Fomundam
	 * Program 3 - Sudoku App
	 * Date: 4/17/2022
	 * A Swing app that allows a user to 
	 * play one or more games of Sudoku.
	 **/

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class SudokuGame extends JFrame implements ActionListener {
	
	BoxListener box = new BoxListener();
	int hintsUsed = 5;
	int[][] puzzle = new int[9][9];
	int[][] result = new int[9][9];
	JButton hintButton, resetButton, checkButton;
	JPanel sidePanel, gridPanel;
	JTextField[][] grid = new JTextField[9][9]; 
	Random rnd = new Random();
	SudokuGenerator sg = new SudokuGenerator();
	
	public SudokuGame() {
		setTitle("Sudoku Game");
		setSize(450,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        checkButton = new JButton("Check");
		checkButton.addActionListener(this);
		hintButton = new JButton("Hint");
		hintButton.addActionListener(this);
		resetButton = new JButton("Reset");
		resetButton.addActionListener(this);
		
		gridPanel = new JPanel(new GridLayout(9,9));
		gridPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
		sidePanel = new JPanel(new GridLayout(3,1,15,15));
		sidePanel.setBackground(Color.DARK_GRAY);
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				sg.setSymmetry(true);
				sg.setValsInPuzzle(17);
				sg.generatePuzzle();
				puzzle = sg.getPuzzle();
				result = sg.getSolution();
				grid[i][j] = new JTextField();
				grid[i][j].setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
				grid[i][j].addActionListener(box);
				grid[i][j].setHorizontalAlignment(JTextField.CENTER);
				grid[i][j].setText("");
				gridPanel.add(grid[i][j]);
				}
			}
		sidePanel.add(checkButton);
		sidePanel.add(hintButton);
		sidePanel.add(resetButton);
		
		add(gridPanel, BorderLayout.CENTER);
		add(sidePanel, BorderLayout.EAST);
		}
	
	public void actionPerformed(ActionEvent e) {
		Object button = e.getSource();
			if(button == hintButton) {
				System.out.println("<< HINT >>");
					int i = rnd.nextInt(9);
					int j = rnd.nextInt(9);
					while(puzzle[i][j] == 0) {
						int x = result[i][j];
						puzzle[i][j] = x;
						grid[i][j].setText("" + x);
						grid[i][j].setEditable(false);
						grid[i][j].setBackground(Color.BLUE);
						hintsUsed--;
						System.out.println("You have " + hintsUsed + " hints left");
					}
					if(hintsUsed == 0) {
						JOptionPane.showMessageDialog(gridPanel, "No more hints");
						hintButton.setVisible(false);
						}
					}
			else if(button == resetButton) {
				System.out.println("<< RESET >>");
				for(int i = 0; i < 9; i++) {
					for(int j = 0; j < 9; j++) {
						int y = puzzle[i][j];
						grid[i][j].setBackground(Color.WHITE);
						if(y == 0) {
							grid[i][j].setText("");
							grid[i][j].setEditable(true);
							}
						else {
							grid[i][j].setText("" + y);
							grid[i][j].setEditable(false);
							}
						}		
					}
				this.gridPanel.repaint();
				this.repaint();
				}
			else {
				System.out.println("<< CHECK >>");
				for(int i = 0; i < 9; i++) {
					for(int j = 0; j < 9; j++) {
						if(puzzle[i][j] == result[i][j]) {
							grid[i][j].setBackground(Color.GREEN);
							grid[i][j].setEditable(false);
							}
						else {
							grid[i][j].setBackground(Color.RED);
							}
						}
					}
				}
			}
	
	class BoxListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			JTextField src = (JTextField) e.getSource();
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					if(grid[i][j] == src) {
						puzzle[i][j] = Integer.parseInt(src.getText());
						}
					}
				}
			}
		}
	
	public static void main(String[] args) {
		SudokuGame window = new SudokuGame();
		window.setVisible(true);
		}
	}