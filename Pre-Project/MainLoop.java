import java.awt.*;
import javax.swing.*;

public class MainLoop {
    
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
        
        
            GUI myFrame = new GUI ("My Frame with Listener Classes");
            myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

}
