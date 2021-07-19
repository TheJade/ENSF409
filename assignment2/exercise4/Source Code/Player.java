import java.util.Scanner;
/**
 * Provides data fields and methods to create a Java data-type, 
 * representing a player in a tic tac toe game program.
 * 
 * @author Tsenguun Ulambayar, Jade Fjestad
 * @version 1.0
 * @since July 15, 2021
 * 
 */
public class Player {
    /**
     * Name of the player.
     */
    private String name;
    /**
     * Tic tac toe board.
     */
    private Board board;
    /**
     * Opponent player.
     */
    private Player opponent;
    /**
     * Mark of the player. Either an X or O.
     */
    private char mark;

    /**
     * Contructs a new Player object by assigning name and mark to the
     * given String and char values.
     * @param n name of Player
     * @param m mark of Player
     */
    public Player(String n, char m){
        name = n;
        mark = m;
    }
    /**
     * Allows current player to make a move, displays the board, then 
     * passes the turn to the other player until there is a winner or 
     * the game ends in a tie.
     * Prints out a message at the end of the game, indicating the winner 
     * or that the game ended in a tie.
     */
    public void play(){
        if(board.xWins()==false){
            if(board.oWins()==false){
                if(board.isFull()==false){
                    makeMove();
                    board.display();
                }
                else{
                    System.out.println("The game has ended in a tie.");
                    return;
                }
            }
            else{//player o wins
                System.out.println("The game is over. The winner is "+findName('O')+".");
                return;
            }
        }
        else{
        //player x wins
            
            System.out.println("The game is over. The winner is "+findName('X')+".");
            return;
        }
        opponent.play();
    }
    /**
     * Finds the name of the player associated with the given mark.
     * @param mark mark of player
     * @return name of the player associated with the mark
     */
    public String findName(char mark){
        if(opponent.mark==mark){
            return opponent.name;
        }
        else{
            return name;
        }
    }
    /**
     * Asks the current player to enter the coordinates 
     * in which they want to place their mark. If the space is empty,
     * a mark will be placed. If the space is already marked, the player
     * will be prompted to try again until they enter coordinates for a valid 
     * space on the board.
     */
    public void makeMove(){
        System.out.println(name+", please enter the row and column "+
        "in which to put a mark. (Enter in the following format: <row> <column>)");
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int row = Integer.valueOf(input[0]);
        int col = Integer.valueOf(input[1]);
        System.out.println(Integer.toString(row)+Integer.toString(col));//?
        if(board.emptySpace(row,col)){
            board.addMark(row,col,mark); 
        }
        else{
            System.out.println("Space is not empty. Please try again.");
            makeMove();
        }
    }
    /**
     * Sets the opponent of the player.
     * @param p opponent
     */
    public void setOpponent(Player p){
        opponent = p;
    }
    /**
     * Sets the board.
     * @param theBoard the tic tac toe board
     */
    public void setBoard(Board theBoard){
        board = theBoard;
    }
}
