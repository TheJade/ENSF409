import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * This class provides the functionality of the insert button
 * all this does really is change the state of the program to the state we want
 * 
 */

public class B4Listener implements ActionListener {

	public B4Listener() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {

			System.out.println("button4 pressed");	//testing
            String courseName= JOptionPane.showInputDialog("Please enter the class ID you want to take (i.e. ENSF409): ");
			
            //CHECKS IF courseName IS WORKS AND PREREQUISITES ARE MET
	}

}