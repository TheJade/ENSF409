

import java.awt.BorderLayout;
import javax.swing.*;

public class FrameExampleWithListenerClass extends JFrame{
	JButton b1, b2;
	//MyListener listener;
	
	public FrameExampleWithListenerClass (String title) {
		super (title);
		//listener = new MyListener (this);
		
		setLayout(new BorderLayout());
		b1 = new JButton ("Submit");
		b2 = new JButton ("Cancel");
		this.add("North", b1);   
		add("Center", b2);
		setVisible(true);
		setBounds(300,300, 200,200);
		//pack();
		
		b1.addActionListener(new B1Listener (this));
		b2.addActionListener(new B2Listener (this));
		
		
		
	}
	public static void main (String [] args) {
		
	try
	{	
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} 
    catch (UnsupportedLookAndFeelException e) {
       // handle exception
    }
    catch (ClassNotFoundException e) {
       // handle exception
    }
    catch (InstantiationException e) {
       // handle exception
    }
    catch (IllegalAccessException e) {
       // handle exception
    }
	
	
		FrameExampleWithListenerClass myFrame = new FrameExampleWithListenerClass ("My Frame with Listener Classes");
		myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	

}
