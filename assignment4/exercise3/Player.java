/**
 * Provides data fields and methods to create the basic framework 
 * of a Java data-type that represents a tic tac toe player.
 * 
 * @author Tsenguun Ulambayar, Jade Fjestad
 * @version 1.0
 * @since July 23, 2021
 * 
 */
public abstract class Player {
    /**
     * Name of the player.
     */
    protected String name;
    /**
     * Tic tac toe board.
     */
    protected Board board;
    /**
     * Opponent player.
     */
    protected Player opponent;
    /**
     * Mark of the player. Either an X or O.
     */
    protected char mark;

    /**
     * Contructs a new Player object by assigning name and mark to the
     * given String and char values.
     * @param n name of Player
     * @param m mark of Player
     */
    protected Player(String n, char m){
        name = n;
        mark = m;
    }
    /**
     * Abstract method
     */
    protected abstract void play();
    /**
     * Finds the name of the player associated with the given mark.
     * @param mark mark of player
     * @return name of the player associated with the mark
     */
    protected String findName(char mark){
        if(opponent.mark==mark){
            return opponent.name;
        }
        else{
            return name;
        }
    }
    
    /**
     * Abstract method.
     */
    protected abstract void makeMove();
    
    /**
     * Sets the opponent of the player.
     * @param p opponent
     */
    protected void setOpponent(Player p){
        opponent = p;
    }
    /**
     * Sets the board.
     * @param theBoard the tic tac toe board
     */
    protected void setBoard(Board theBoard){
        board = theBoard;
    }
}
