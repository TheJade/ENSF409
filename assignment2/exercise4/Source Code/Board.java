/**
 * Provides data fields and methods to create most of the logic for a
 * tic tac toe game. 
 * This class was made as part of ENSF 409 Assignment 2 Exercise 4.
 * 
 * @author Tsenguun Ulambayar, Jade Fjestad
 * @version 1.0
 * @since July 15, 2021
 */
public class Board implements Constants {
	/**
	 * Represents the tic tac toe board
	 */
	private char theBoard[][];
	/**
	 * The number of marks on the board
	 */
	private int markCount;
    /**
	 * Constructs a Board object by creating a blank 3 by 3 char
	 * array to represent a blank tic tac toe board.
	 */
	public Board() {
		markCount = 0;
		theBoard = new char[3][];
		for (int i = 0; i < 3; i++) {
			theBoard[i] = new char[3];
			for (int j = 0; j < 3; j++)
				theBoard[i][j] = SPACE_CHAR;
		}
	}
    /**
	 * Gets a character value, specified by a row and column, from theBoard. 
	 * @param row row of desired theBoard element
	 * @param col column of desired theBoard element
	 * @return character in specified location in theBoard
	 */
	public char getMark(int row, int col) {
		return theBoard[row][col];
	}

    /**
	 * Checks whether theBoard is full or not by checking markCount value.
	 * @return True if markCount equals 9, otherwise returns False
	 */
	public boolean isFull() {
		return markCount == 9;
	}

	/**
	 * Checks if player x is the winner.
	 * @return true if player x is the winner, otherwise returns false.
	 */
	public boolean xWins() {
		if (checkWinner(LETTER_X) == 1)
			return true;
		else
			return false;
	}
    /**
	 * checks if player o is the winner.
	 * @return true if player o is the winner, otherwise returns false.
	 */
	public boolean oWins() {
		if (checkWinner(LETTER_O) == 1)
			return true;
		else
			return false;
	}
    /**
	 * Displays the formatted tic tac toe board, complete with 
	 * marks, hyphens, headers, and spaces.
	 */
	public void display() {
		displayColumnHeaders();
		addHyphens();
		for (int row = 0; row < 3; row++) {
			addSpaces();
			System.out.print("    row " + row + ' ');
			for (int col = 0; col < 3; col++)
				System.out.print("|  " + getMark(row, col) + "  ");
			System.out.println("|");
			addSpaces();
			addHyphens();
		}
	}

	/**
	 * Adds a given character into theBoard at the location specified
	 * by a row and column.
	 * @param row row where mark will be added
	 * @param col column where mark will be added
	 * @param mark character to place onto theBoard
	 */
	public void addMark(int row, int col, char mark) {
		
		theBoard[row][col] = mark;
		markCount++;
	}

	/**
	 * Clears theBoard. i.e. It makes every element a space character.
	 */
	public void clear() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				theBoard[i][j] = SPACE_CHAR;
		markCount = 0;
	}

	/**
	 * Checks whether a given character is the winning mark or not.
	 * @param mark character that is checked for being the winning mark
	 * @return 1 if the character is the winning mark, otherwise returns 0.
	 */
	int checkWinner(char mark) {
		int row, col;
		int result = 0;

		for (row = 0; result == 0 && row < 3; row++) {
			int row_result = 1;
			for (col = 0; row_result == 1 && col < 3; col++)
				if (theBoard[row][col] != mark)
					row_result = 0;
			if (row_result != 0)
				result = 1;
		}

		
		for (col = 0; result == 0 && col < 3; col++) {
			int col_result = 1;
			for (row = 0; col_result != 0 && row < 3; row++)
				if (theBoard[row][col] != mark)
					col_result = 0;
			if (col_result != 0)
				result = 1;
		}

		if (result == 0) {
			int diag1Result = 1;
			for (row = 0; diag1Result != 0 && row < 3; row++)
				if (theBoard[row][row] != mark)
					diag1Result = 0;
			if (diag1Result != 0)
				result = 1;
		}
		if (result == 0) {
			int diag2Result = 1;
			for (row = 0; diag2Result != 0 && row < 3; row++)
				if (theBoard[row][3 - 1 - row] != mark)
					diag2Result = 0;
			if (diag2Result != 0)
				result = 1;
		}
		return result;
	}

	/**
	 * Displays the column headers of the tic tac toe board.
	 */
	void displayColumnHeaders() {
		System.out.print("          ");
		for (int j = 0; j < 3; j++)
			System.out.print("|col " + j);
		System.out.println();
	}

	/**
	 * Adds hyphens to the display of the tic tac toe board.
	 */
	void addHyphens() {
		System.out.print("          ");
		for (int j = 0; j < 3; j++)
			System.out.print("+-----");
		System.out.println("+");
	}

	/**
	 * Adds spaces to the display of the tic tac toe board.
	 */
	void addSpaces() {
		System.out.print("          ");
		for (int j = 0; j < 3; j++)
			System.out.print("|     ");
		System.out.println("|");
	}
	/**
	 * Checks if a space at the given indices on the board is empty.
	 * @param row row
	 * @param column column
	 * @return true if there is an empty char in the space at given row and column, otherwise
	 * returns false.
	 */
	public boolean emptySpace(int row, int column){
        if(theBoard[row][column]==' '){
			return true;
		}
		else return false;
	}
}
