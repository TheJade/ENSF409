import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B2Listener implements ActionListener {

	
	private GUI myFrame;

	public B2Listener(GUI myFrame) {
		this.myFrame = myFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			System.out.println("2");
			MainLoop.state = 2;

	}

}