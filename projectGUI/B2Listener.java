import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 * This class provides the functionality of the insert button
 * all this does really is change the state of the program to the state we want
 * 
 */

public class B2Listener implements ActionListener {

	private int[] state = new int[]{3};

	public B2Listener(int[] s) {
		state[0] = s[0];
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			System.out.println("button2 pressed");	//testing
            GUIStudent.state[0] = 4;
			
	}

}