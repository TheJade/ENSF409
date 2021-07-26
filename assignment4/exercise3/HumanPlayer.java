import java.util.Scanner;
/**
 * Provides data fields and methods to create a Java data-type, 
 * representing a human player in a tic tac toe game program.
 * Extends the abstract class, Player.
 * 
 * @author Tsenguun Ulambayar, Jade Fjestad
 * @version 1.0
 * @since July 23, 2021
 * 
 */
public class HumanPlayer extends Player{
    /**
     * Contructs a new HumanPlayer object by calling the super constructor 
     * to assign name and mark to the given String and char values.
     * @param n name of Player
     * @param m mark of Player
     */
    protected HumanPlayer(String n, char m){
        super(n, m);
    }
    /**
     * Allows human player to make a move, displays the board, then 
     * passes the turn to the other player until there is a winner or 
     * the game ends in a tie.
     * Prints out a message at the end of the game, indicating the winner 
     * or that the game ended in a tie.
     */
    protected void play(){
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
     * Asks the human player to enter the coordinates 
     * in which they want to place their mark. If the space is empty,
     * a mark will be placed. If the space is already marked, the player
     * will be prompted to try again until they enter coordinates for a valid 
     * space on the board.
     */
    protected void makeMove(){
        System.out.println(name+", please enter the row and column "+
        "in which to put a mark. (Enter in the following format: <row> <column>)");
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int row = Integer.valueOf(input[0]);
        int col = Integer.valueOf(input[1]);
        if(board.emptySpace(row,col)){
            board.addMark(row,col,mark); 
        }
        else{
            System.out.println("Space is not empty. Please try again.");
            makeMove();
        }
    }
    
}
