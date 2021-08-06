import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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