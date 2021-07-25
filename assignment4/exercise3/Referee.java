/**
 * Provides data fields and methods to create a Java data-type, 
 * representing a referee in a tic tac toe game program.
 * 
 * @author Tsenguun Ulambayar, Jade Fjestad
 * @version 1.0
 * @since July 15, 2021
 */
public class Referee {
    /**
     * Player whose mark is 'X'
     */
    private Player xPlayer;
    /**
     * Player whose mark is 'O'
     */
    private Player oPlayer;
    /**
     * The tic tac toe board
     */
    private Board board;
    /**
     * Sets the opponents of each player, displays the board, 
     * and starts the game with Player X making the first move.
     */
    public void runTheGame(){
        xPlayer.setOpponent(oPlayer);
        oPlayer.setOpponent(xPlayer);
        board.display();
        xPlayer.play();
    }
    /**
     * Sets the board to a given Board object.
     * @param board tic tac toe board
     */
    public void setBoard(Board board){
        this.board = board;

    }
    /**
     * Sets Player O to a given Player object.
     * @param oPlayer Player O
     */
    public void setoPlayer(Player oPlayer){
        this.oPlayer = oPlayer;

    }
    /**
     * Sets Player X to a given Player object.
     * @param xPlayer Player X
     */
    public void setxPlayer(Player xPlayer){
        this.xPlayer = xPlayer;

    }
}
