import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B1Listener implements ActionListener {

	private GUI myFrame;

	public B1Listener(GUI myFrame) {
		this.myFrame = myFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			System.out.println("Submit");
	}

}