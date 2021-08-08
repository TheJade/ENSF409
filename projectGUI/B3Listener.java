import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 * This class provides the functionality of the insert button
 * all this does really is change the state of the program to the state we want
 * 
 */

public class B3Listener implements ActionListener {

	private int[] state = new int[]{3};
	private JFrame frame;

	public B3Listener(int[] state, JFrame f) {
		state[0] = state[0];
		frame = f;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			System.out.println("button3 pressed");	//testing
            GUIStudent.state[0] = 2;
			frame.setVisible(false);
			
	}

}