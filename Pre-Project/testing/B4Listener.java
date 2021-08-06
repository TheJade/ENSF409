import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * This class provides the functionality of the create tree from file button
 * all this does really is change the state of the program to the state we want
 * 
 */
public class B4Listener implements ActionListener {

	private GUI myFrame;

	public B4Listener(GUI myFrame) {
		this.myFrame = myFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			System.out.println("going to state 1");
			MainLoop.state = 1;
	}

}