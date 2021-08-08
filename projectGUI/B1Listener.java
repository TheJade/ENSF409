import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class provides the functionality of the insert button
 * all this does really is change the state of the program to the state we want
 * 
 */

public class B1Listener implements ActionListener {

	private int[] state = new int[]{3};

	public B1Listener(int[] state) {
		state[0] = state[0];
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			System.out.println("button1 pressed");
            GUIStudent.state[0] = 3;
            System.out.print(GUIStudent.state[0]);
			
	}

}