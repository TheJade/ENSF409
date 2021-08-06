import java.awt.*;
import javax.swing.*;

public class MainLoop {
    
    BinSearchTree tree;
    static int state = 1;

    public static void main (String [] args) {
		
        BinSearchTree tree = new BinSearchTree();
        GUI myFrame = new GUI("Home Menu", tree);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        while (true) {
            System.out.print("");  //idk why but this line is needed to make the states work, i've tried everything ugh.
            if (state == 0){
                //wait state will be in main menu
                continue;
            }
            if (state == 1){
                System.out.println("In state 1...");
                myFrame.treeInput();        
                state = 0;
            }
            if (state == 2){    //find state
                System.out.println("In state 2...");
                myFrame.findGUI();
                state = 0;
            }
            
        
            
        }
    }

}
