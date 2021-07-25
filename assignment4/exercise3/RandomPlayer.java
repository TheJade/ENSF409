
/**
 * Provides data fields and methods to create a Java data-type, 
 * representing a random player in a tic tac toe game program.
 * Extends the abstract class, Player.
 * 
 * @author Tsenguun Ulambayar, Jade Fjestad
 * @version 1.0
 * @since July 23, 2021
 * 
 */
public class RandomPlayer extends Player{
    /**
     * The random generator.
     */
    protected RandomGenerator rg;

    /**
     * Contructs a new RandomPlayer object by calling the super constructor 
     * to assign name and mark to the given String and char values. Then 
     * assigns rg to a new RandomGenerator.
     * @param n name of Player
     * @param m mark of Player
     */
    protected RandomPlayer(String n, char m){
        super(n, m);
        rg = new RandomGenerator();
    }
    /**
     * Allows random player to make a move, displays the board, then 
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
     * Uses random generator, rg, to generate a coordinate on the board. 
     * If the space at the coordinate is empty,
     * a mark will be placed. If the space is already marked, it 
     * will try again until it finds an empty spot.
     */
    protected void makeMove(){
        int row = rg.discrete(0,2);
        int col = rg.discrete(0,2);
        if(board.emptySpace(row,col)){
            board.addMark(row,col,mark); 
        }
        else{
            makeMove();
        }
    }
}
