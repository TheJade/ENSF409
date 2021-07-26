import java.io.*;
/**
 * Provides data fields and methods that help create the starting point
 * of a tic tac toe game.
 * 
 * @author Tsenguun Ulambayar, Jade Fjestad
 * @version 1.0
 * @since July 23, 2021
 */
public class Game implements Constants {
    /**
	 * The tic tac toe board
	 */
	private Board theBoard;
	/**
	 * The referee
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
	 * Gets user to input two player names and creates two Player objects by 
	 * calling the create_player method.
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

		xPlayer = create_player (name, LETTER_X, theGame.theBoard, stdin);
		
		System.out.print("\nPlease enter the name of the \'O\' player: ");
		name = stdin.readLine();
		while (name == null) {
			System.out.print("Please try again: ");
			name = stdin.readLine();
		}
		
		oPlayer = create_player (name, LETTER_O, theGame.theBoard, stdin);
		
		theRef = new Referee();
		theRef.setBoard(theGame.theBoard);
		theRef.setoPlayer(oPlayer);
		theRef.setxPlayer(xPlayer);
        
        theGame.appointReferee(theRef);
	}
	
	/**
	 * Creates the specified type of player indicated by the user. 
	 * 
	 * @param name player's name
	 * @param mark player's mark (X or O)
	 * @param board refers to the game board
	 * @param stdin refers to an input stream
	 * @return a newly created player
	 * @throws IOException
	 */
	static public Player  create_player(String name, char mark, Board board,
			BufferedReader stdin)throws IOException {
		// Get the player type.
		final int NUMBER_OF_TYPES = 3;
		System.out.print ( "\nWhat type of player is " + name + "?\n");
		System.out.print("  1: Human\n" + "  2: Random Player\n"
		+ "  3: Blocking Player\n");
		System.out.print( "Please enter a number in the range 1-" + NUMBER_OF_TYPES + ": ");
		int player_type = 0;

		String input;
		stdin = new BufferedReader(new InputStreamReader(System.in));
		input= stdin.readLine();
		player_type = Integer.parseInt(input);
		while (player_type < 1 || player_type > NUMBER_OF_TYPES) {
			System.out.print( "Please try again.\n");
			System.out.print ( "Enter a number in the range 1-" +NUMBER_OF_TYPES + ": ");
			input= stdin.readLine();
			player_type = Integer.parseInt(input);
		}
		
		// Create a specific type of Player 
		Player result = null;
		switch(player_type) {
			case 1:
				result = new HumanPlayer(name, mark);
				break;
			case 2:
				result = new RandomPlayer(name, mark);
				break;
			case 3:
				result = new BlockingPlayer(name, mark);
				break;
			default:
				System.out.print ( "\nDefault case in switch should not be reached.\n"
				+ "  Program terminated.\n");
				System.exit(0);
		}
		result.setBoard(board);
		return result;
	}
}
