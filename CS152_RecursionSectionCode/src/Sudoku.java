/**Programmer: Manny Fomundam
	 * Programming Project 2: Sudoku Puzzle
	 * Date: 3/15/2022
	 * You are to read in a Sudoku puzzle from a file 
	 * and output it’s solution using abacktracking algorithm.
	 **/

import java.util.*;
import java.io.*;

public class Sudoku {
	
	public static boolean isInRow(int SudokuBoard[][], int row, int num) {
		for(int c = 0; c < 9; c++) {
			if(SudokuBoard[row][c] == num) {
				return true;
			}
		}
		return false;
		}
	
	public static boolean isInColumn(int SudokuBoard[][], int col, int num) {
		for(int r = 0; r < 9; r++) {
			if(SudokuBoard[r][col] == num) {
				return true;
			}
		}
		return false;
		}
	
	public static boolean isInBox(int SudokuBoard [][], int row, int col, int num) {
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				if(SudokuBoard[row + r][col + c] == num) {
					return true;
				}
			}
		}
		return false;
		}
	
	public static boolean isValid(int SudokuBoard [][], int row, int col, int num) {
		if(!isInBox(SudokuBoard, row - row % 3, col - col % 3, num) && !isInRow(SudokuBoard, row, num) && !isInColumn(SudokuBoard, col, num) && SudokuBoard[row][col] == 0) {
			return true;
			}
		return false;
		}
	
	public static boolean findZeros(int SudokuBoard [][], int square []) {
		square[0] = square[1] = -1;
		for(int r = 0; r < 9; r++) {
			for(int c = 0; c < 9; c++) {
				if(SudokuBoard[r][c] == 0) {
					square[0] = r;
					square[1] = c;
					return true;
					}
				}
			}
		return false;
		}
	
	public static boolean solveSudokuBoard(int SudokuBoard [][]) {
		int row, col;
		int [] square = new int [2];
		if(!findZeros(SudokuBoard, square)) {
			return true;
		}
		row = square[0];
		col = square[1];
		for(int numToTry = 1; numToTry <= 9; numToTry++) {
			if(isValid(SudokuBoard, row, col, numToTry)) {
				SudokuBoard[row][col] = numToTry;
			if(solveSudokuBoard(SudokuBoard))
				return true;
			SudokuBoard[row][col] = 0;
			}
		}
		return false;
	}
	
	public static void printSudokuBoard(int SudokuBoard [][]) {
		System.out.println("|------+------+-----|");
		for (int r = 0; r < 9; r++) {
			System.out.print("|");
			for (int c = 0; c < 9; c++) {
				if (c == 3) {
					System.out.print("|");
				}
				if (c == 6) {
					System.out.print("|");
				}
				if (c == 9) {
					System.out.print("|");
				}
				System.out.print(SudokuBoard[r][c]);
				
				System.out.print(" ");
			}
			System.out.print("\n");
			if ((r + 1) % (int) Math.sqrt(9) == 0) {
				System.out.print("");
				System.out.println("|------+------+-----|");
				}
			}
		}
	
	public static void main(String[] args) throws FileNotFoundException {
		int [][] SudokuBoard = new int[9][9];
		
		try {
			File file = new File("sud2.txt");
			Scanner fin = new Scanner(file);
			System.out.println("\nHere is the initial puzzle: ");
			while(fin.hasNext()) {
				System.out.println("|------+------+-----|");
				for (int r = 0; r < SudokuBoard.length; r++) {
					System.out.print("|");
					for (int c = 0; c < SudokuBoard.length; c++) {
						if (c == 3) {
							System.out.print("|");
							}
						if (c == 6) {
							System.out.print("|");
							}
						if (c == 9) {
							System.out.print("|");
							}
						SudokuBoard[r][c] = fin.nextInt();
						System.out.print(SudokuBoard[r][c]);
						System.out.print(" ");
						}
					System.out.print("\n");
					if ((r + 1) % (int) Math.sqrt(9) == 0) {
						System.out.print("");
						System.out.println("|------+------+-----|");
						}
					}
			
			for(int r = 0; r < 9; r++)
				for(int c = 0; c < 9; c++)
					if(fin.hasNextInt())
						SudokuBoard[r][c] = fin.nextInt();
			}
		}
		catch (Exception e) {
			System.out.print("Sudoku Puzzle does not exist!");
			System.out.println("\nFile not found\n");
			System.exit(0);
		}
		
		if(solveSudokuBoard(SudokuBoard)) {
			System.out.println("\nHere is the final puzzle: ");
			printSudokuBoard(SudokuBoard);
			}
		else {
			System.out.println("No solution");
			}
		}	
	}
