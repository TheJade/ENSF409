import java.awt.*;
import javax.swing.*;

public class MainLoop {
    
    BinSearchTree tree;
    static int state = 1;

    public static void main (String [] args) {
		
        BinSearchTree tree = new BinSearchTree();

        while (true) {
            if (state == 0){
                //wait state will be in main menu
                continue;
            }
            if (state == 1){
                GUI myFrame = new GUI("Home Menu", tree);
                myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                state = 0;
            }
            
        
            
        }
    }

}
