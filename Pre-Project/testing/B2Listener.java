import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class provides the functionality of the find button
 * all this does really is change the state of the program to the state we want
 * 
 */

public class B2Listener implements ActionListener {

	
	private GUI myFrame;

	public B2Listener(GUI myFrame) {
		this.myFrame = myFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			System.out.println("Going to fine state...");
			MainLoop.state = 2;

	}

}