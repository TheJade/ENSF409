import java.awt.*;
import javax.swing.*;

public class MainLoop {
    
    BinSearchTree tree;

    public static void main (String [] args) {
		
        //try
        //{	
        //	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        //} 
        //catch (UnsupportedLookAndFeelException e) {
        //   // handle exception
        //}
        //catch (ClassNotFoundException e) {
        //   // handle exception
        //}
        //catch (InstantiationException e) {
        //   // handle exception
        //}
        //catch (IllegalAccessException e) {
        //   // handle exception
        //}
            BinSearchTree tree = new BinSearchTree();
        
            GUI myFrame = new GUI("Home Menu", tree);
            myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

}
