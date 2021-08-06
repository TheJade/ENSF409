

import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame{
	JButton b1, b2, b3;
	JPanel p;

	//MyListener listener;

	String txtName;
	
	public GUI (String title){//, BinSearchTree tree ) {
		super (title);
		//listener = new MyListener (this);
		txtName= JOptionPane.showInputDialog("Please enter file name (i.e. input.txt):");

		new Reader();
		
		Reader.readFile(txtName);//, tree);
		//setLayout(new BorderLayout());

		p = new JPanel(new GridBagLayout());
		b1 = new JButton ("OK");
		b2 = new JButton ("Cancel");

		GridBagConstraints c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 1;
		
		p.add(b1, c); 
		c.gridx = 1;
		c.gridy = 1;  
		p.add(b2, c);

		this.add(p, BorderLayout.SOUTH);

		//num = Integer.parseInt(JOptionPane.showInputDialog("Enter the file name:"));

		b3 = new JButton (txtName);	//testing
		this.add(b3);
		
		
		setVisible(true);
		setBounds(300,300, 200,200);
		//pack();
		
		b1.addActionListener(new B1Listener (this));
		b2.addActionListener(new B2Listener (this));
		
		
		
	}
	//public static void main (String [] args) {
	//	
	////try
	////{	
	////	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	////} 
    ////catch (UnsupportedLookAndFeelException e) {
    ////   // handle exception
    ////}
    ////catch (ClassNotFoundException e) {
    ////   // handle exception
    ////}
    ////catch (InstantiationException e) {
    ////   // handle exception
    ////}
    ////catch (IllegalAccessException e) {
    ////   // handle exception
    ////}
	//
	//
	//	GUI myFrame = new GUI ("My Frame with Listener Classes");
	//	myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	//}
	

}