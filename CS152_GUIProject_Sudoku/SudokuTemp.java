
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SudokuTemp extends JFrame implements ActionListener {

	private JButton hintButton, resetButton, solveButton, undoButton, guessButton;
	private JTextField[][] grid;
	private JTextField sudoku;
	private JPanel gridPanel = new JPanel(new GridLayout(9,9));
	
	public SudokuTemp() {
		setTitle("Sudoku Board");
		setSize(450,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
		hintButton = new JButton("Hint");
		hintButton.addActionListener(this);
		resetButton = new JButton("Reset");
		resetButton.addActionListener(this);
		solveButton = new JButton("Solve");
		solveButton.addActionListener(this);
		undoButton = new JButton("Undo");
		undoButton.addActionListener(this);
		guessButton = new JButton("Guess");
		guessButton.addActionListener(this);
		
		JPanel sidePanel = new JPanel(new GridLayout(5,1,15,15));
		//JPanel gridPanel = new JPanel(new GridLayout(9,9));
		
		grid = new JTextField[9][9];
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				sudoku = new JTextField("0");
				grid[i][j] = sudoku;
				gridPanel.add(sudoku);
			}
		}
		
		sidePanel.add(hintButton);
		sidePanel.add(resetButton);
		sidePanel.add(solveButton);
		sidePanel.add(undoButton);
		sidePanel.add(guessButton);
		
		add(sidePanel, BorderLayout.EAST);
		add(gridPanel, BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object button = e.getSource();
		//if(button.equals("Hint")) {
		if(button == hintButton ) {
			
			System.out.println("<< HINT >>");
		}
		//else if(button.equals("Reset")) {
		else if(button == resetButton) {
		
			JTextField resetTxt  = new JTextField("R");
			System.out.println("<< reset >>");
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					
					grid[i][j].setText("X");
					// 
			
				}
				
			}
			this.gridPanel.repaint();
			this.repaint();
			
		}
		//else if(button.equals("Solve")) {
		else if(button == solveButton) {
			System.out.println("<< Solve >>");
		}
		else if(button.equals("Undo")) {
			System.out.println("<< undo >>");
		}
		else {
			
		}
	}
	
	void setSymmetry(boolean flag) {
		
	}
	
	void setValsInPuzzle(int n) {
		
	}
	
	void generatePuzzle() {
		 
	}
	
	int[][] getPuzzle() {
		
		int[][] grid = new int[9][9];
		for (int i = 0; i < 9; i++) 
		 for (int j = 0; j < 9; j++)
		 grid[i][j] = 0;
		 
		 return grid;
		//return null;
		
		
	}
	
	int[][] getSolution() {
		return null;
		
		
	}
	// Validate if value in grid[m][n] is correct 
	 public static boolean isGridValid(int m, int n, int[][] grid) {
	 // verify whether  grid[m][n] is unique in m's row
	 for (int column = 0; column < 9; column++)
	   if (column != n && grid[m][column] == grid[m][n]) 
	      return false;
	 
	 // verify that grid[m][n] is unique in n column
	 for (int row = 0; row < 9; row++)
	    if (row != m && grid[row][n] == grid[m][n]) 
	       return false;
	 
	 // verify if grid[i][j] is unique in the 3−by−3 matrix
	 for (int row = (m / 3) * 3; row < (m / 3) * 3 + 3; row++)
	 for (int col = (n / 3) * 3; col < (n / 3) * 3 + 3; col++)
	 if (!(row == m && col == n) && grid[row][col] == grid[m][n])
	 return false;
	 
	 return true; // current  grid[m][n] is correct
	 }
	 
	 //Validate solution - verify if proposed solution is correct
	 public static boolean validateSolution(int[][] grid) {
		 
		 for (int i = 0; i < 9; i++)
			  for (int j = 0; j < 9; j++)
			  if (grid[i][j] < 1 || grid[i][j] > 9
			  || !isGridValid(i, j, grid))
			  return false;
			  return true; // solution is correct
	 }
	
public static void printTwoDimArray(int[][] towDimArray){
		
		if(towDimArray.length > 0) {
		for (int row = 0; row < towDimArray.length; row++) {
			 for (int column = 0; column < towDimArray[row].length; column++) {
			 System.out.print(towDimArray[row][column] + " ");
			 }
			 System.out.println();
			}
		}else {System.out.println("No Elements in array");}
		
	}
	
	public static void main(String[] args) {
			SudokuTemp window = new SudokuTemp();
			
			
			window.setVisible(true);
			}
	}
