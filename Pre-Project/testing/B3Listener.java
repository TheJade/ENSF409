import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B3Listener implements ActionListener {

	private GUI myFrame;

	public B3Listener(GUI myFrame) {
		this.myFrame = myFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			System.out.println("3");
	}

}