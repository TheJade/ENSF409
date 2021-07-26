/**
 * Provides data fields and methods to create a Java data-type, 
 * representing a blocking player in a tic tac toe game program.
 * Extends class RandomPlayer.
 * 
 * @author Tsenguun Ulambayar, Jade Fjestad
 * @version 1.0
 * @since July 23, 2021
 * 
 */
public class BlockingPlayer extends RandomPlayer{
    /**
     * Contructs a new BlockingPlayer object by calling the super constructor 
     * to assign name and mark to the given String and char values, and assign 
     * rg to a new RandomGenerator object.
     * @param n name of Player
     * @param m mark of Player
     */
    protected BlockingPlayer(String n, char m){
        super(n, m);
    }
    /**
     * Checks if the given row and column is associated with a space 
     * on the board needs be filled with a mark to prevent the opponent 
     * from winning.
     * @param row row
     * @param col column
     * @return true if filling the space at the given coordinate will prevent 
     * the opponent from winning, otherwise returns false.
     */
    protected boolean testForBlocking(int row, int col){
        //if in first column
        if(col ==0){
            //check horizontally
            if(board.getMark(row,1)==opponent.mark){
                if(board.getMark(row,2)==opponent.mark){
                    return true;//block
                }
            }
            if(row==0){
                //check diagonally down from 0,0
                if(board.getMark(1,1)==opponent.mark){
                    if(board.getMark(2,2)==opponent.mark){
                        return true;
                    }
                }
            }
            if(row==2){
                //check diagonally up from 2,0
                if(board.getMark(1,1)==opponent.mark){
                    if(board.getMark(2,2)==opponent.mark){
                        return true;
                    }
                }
            }
        }
        //if in middle column
        if(col==1){
            //check horizontally
            if(board.getMark(row,0)==opponent.mark){
                if(board.getMark(row,2)==opponent.mark){
                    return true;
                }
            }
            //if in the centre of board
            if(row==1){
                //check diagonally from 0,0 to 2,2
                if(board.getMark(0,0)==opponent.mark){
                    if(board.getMark(2,2)==opponent.mark){
                        return true;
                    }
                }
                //check diagonally from 2,0 to 0,2
                if(board.getMark(2,0)==opponent.mark){
                    if(board.getMark(0,2)==opponent.mark){
                        return true;
                    }
                }
            }
        }
        //if in left column
        if(col ==2){
            //check horizontally
            if(board.getMark(row,1)==opponent.mark){
                if(board.getMark(row,0)==opponent.mark){
                    return true;//block
                }
            }
            if(row==0){
                //check diagonally down from 0,2
                if(board.getMark(1,1)==opponent.mark){
                    if(board.getMark(2,0)==opponent.mark){
                        return true;
                    }
                }
            }
            if(row==2){
                //check diagonally up from 2,2
                if(board.getMark(1,1)==opponent.mark){
                    if(board.getMark(0,0)==opponent.mark){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    /**
     * Traverses through the board and checks if there is an empty space 
     * needs to be filled to prevent the opponent from winning, by calling 
     * the method, testForBlocking. If the method returns true, a mark is placed 
     * in the current row and column. If after traversing the whole board, there is no 
     * row and column that passes the test for blocking, it places a mark at a 
     * random empty space by calling the method, placeRandom.
     */
    protected void makeMove(){
        for(int r=0;r<3;r++){
            for(int c=0; c<3; c++){
                if(board.emptySpace(r,c)){
                    if(testForBlocking(r,c)){
                        board.addMark(r,c,mark);
                        return;
                    }
                }
            }
        }
        placeRandom();
    }
 
    /**
     * Generates two integers between 0 and 2 to become the row 
     * and column of the board, in which to place a mark if the space 
     * is empty. If the space is not empty, it calls itself again until 
     * it is able to place a mark.
     */
    private void placeRandom(){
        int row = rg.discrete(0,2);
        int col = rg.discrete(0,2);
        if(board.emptySpace(row,col)){
            board.addMark(row,col,mark); 
        }
        else{
            placeRandom();
        }
    }
}

