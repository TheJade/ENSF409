import java.awt.*;
import javax.swing.*;

/**
 * This class contains the main loop that will act as the OS of the program.
 * This loop goes though different states depending on what the user is doing.
 * 
 * NOTE: the program prompts the user to input the text file first. Therefore no need to utilize the Browse button. Although the browse button in included the functionality is not needed.
 *       Please be nice with the program, exception handling was not a priority.
 * 
 * @author Tsenguun Ulambayar, Jade Fjestad
 * @since August 5th, 2021
 * @version 1.0
 */


public class GUIControlLoop {
    static int state[] = {1};

    public static void main (String [] args) {

        /**
         * the change of state occurs in the Listener classes of each button
         */
        while (true) {
            // System.out.print("");  //idk why but this line is needed to make the states work, i've tried everything lol.
            if (state[0] == 0){    
                //wait state will be in main menu
                continue;
            }
            else if (state[0] == 1){    //input
                System.out.println("In state 1...");
                myFrame.treeInput();        
                state = 0;
            }
            else if (state[0] == 2){    //find state
                System.out.println("In state 2...");
                myFrame.findGUI();
                state = 0;
            }
            else if (state[0] ==3){
                System.out.println("In state 3...");
                myFrame.insertGUI();
                //myFrame.setVisible(false);  //hides the previous 
                myFrame.mainMenuGUI();  //resets the screen info
                state = 0;
            }
            
        
            
        }
    }
}
