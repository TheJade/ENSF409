import java.io.*;

/**
 * Provides data fields and methods that help create a starting point
 * of a tic tac toe game.
 * This class was made as part of ENSF 409 Assignment 2 Exercise 4. 
 * 
 * @author Tsenguun Ulambayar, Jade Fjestad
 * @version 1.0
 * @since July 15, 2021
 */
public class Game implements Constants {
	/**
	 * The tic tac toe board
	 */
	private Board theBoard;
	/**
	 * The referee of the game
	 */
	private Referee theRef;
	
	/**
	 * Constructs a new Game object by creating a new Board object
	 * and assigning it to theBoard.
	 */
    public Game( ) {
        theBoard  = new Board();
	}
    /**
	 * Assigns a given Referee object to theRef and calls the function,
	 * runTheGame(), to start the tic tac toe game.
	 * @param r the Referee object that you want to assign to theRef
	 * @throws IOException
	 */
    public void appointReferee(Referee r) throws IOException {
        theRef = r;
    	theRef.runTheGame();
    }
	/**
	 * Starts a tic tac toe game.
	 * Gets user to input two player names and creates two Player objects.
	 * Gets both players to set the board. Creates new Referee and Game objects
	 * and starts the game.
	 * @param args ignored command line argument
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Referee theRef;
		Player xPlayer, oPlayer;
		BufferedReader stdin;
		Game theGame = new Game();
		stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nPlease enter the name of the \'X\' player: ");
		String name= stdin.readLine();
		while (name == null) {
			System.out.print("Please try again: ");
			name = stdin.readLine();
		}

		xPlayer = new Player(name, LETTER_X);
		xPlayer.setBoard(theGame.theBoard);
		
		System.out.print("\nPlease enter the name of the \'O\' player: ");
		name = stdin.readLine();
		while (name == null) {
			System.out.print("Please try again: ");
			name = stdin.readLine();
		}
		
		oPlayer = new Player(name, LETTER_O);
		oPlayer.setBoard(theGame.theBoard);
		
		theRef = new Referee();
		theRef.setBoard(theGame.theBoard);
		theRef.setoPlayer(oPlayer);
		theRef.setxPlayer(xPlayer);
        
        theGame.appointReferee(theRef);
	}
	

}
