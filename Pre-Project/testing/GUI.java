

import java.awt.*;
import javax.swing.*;
import java.io.*;

/**
 * This class contains the methods used to produce the GUI for the user
 * Note browse button is not needed since it happens automatically
 * 
 * @author Tsenguun Ulambayar, Jade Fjestad
 * @since August 5th, 2021
 * @version 1.0
 */

public class GUI extends JFrame{
	JButton b1, b2, b3, b4;
	JPanel p;
	BinSearchTree tree;

	//MyListener listener;

	String txtName;
	/**
	 * simple constructor assigns values
	 * @param title	title of the main menu screen
	 * @param treeIn the BinSearchTree object that is used to store the data
	 */
	public GUI (String title, BinSearchTree treeIn ) {
		super (title);
		tree = treeIn;
		//listener = new MyListener (this);
		
		
	}

	/**
	 * prompts user for file name input
	 * Then reads the files from the .txt doc
	 * The read files are inserted into the BinSearchTree object (tree)
	 */
	public void treeInput()	{
		tree.destroy();
		txtName= JOptionPane.showInputDialog("Please enter file name (i.e. input.txt):");

		new Reader();
		
		Reader.readFile(txtName, tree);
		//setLayout(new BorderLayout());
		
		mainMenuGUI();
	}

	/**
	 * this is the gui for the main menu.
	 * Providing the buttons, position, listeners and more for the main menu.
	 * This is the main state of the program.
	 */
	public void mainMenuGUI(){

		try {
			p = new JPanel(new GridBagLayout());
			b1 = new JButton ("Insert");
			b2 = new JButton ("Find");
			//b3 = new JButton ("Browse");
			b4 = new JButton ("Create Tree From File");

			GridBagConstraints c = new GridBagConstraints();

			c.insets = new Insets(10, 10, 10, 10);
			c.gridx = 0;
			c.gridy = 1;
			p.add(b1, c); 

			c.gridx = 1;
			c.gridy = 1;  
			p.add(b2, c);

			//c.gridx = 3;
			//c.gridy = 1;
			//p.add(b3, c); 
			
			c.gridx = 2;
			c.gridy = 1;  
			p.add(b4, c);

			this.add(p, BorderLayout.SOUTH);

			//num = Integer.parseInt(JOptionPane.showInputDialog("Enter the file name:"));

			
				Node root = tree.getRoot();

				StringWriter temp_string = new StringWriter();
				PrintWriter writer = new PrintWriter(temp_string);
				tree.print_tree(root, writer);
				JTextArea area = new JTextArea(temp_string.toString());	//can't figure out this line

				writer.close();
			

        	//JTextArea area=new JTextArea("Welcome\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12");  
			
			area.setEditable(false);
			JScrollPane scrollPane = new JScrollPane(area);
			
			this.add(scrollPane);
			
			setVisible(true);
			setBounds(300,300, 500,400);
			
			b1.addActionListener(new B1Listener (this));
			b2.addActionListener(new B2Listener (this));
			//b3.addActionListener(new B3Listener (this));
			b4.addActionListener(new B4Listener (this));
		}
		catch (FileNotFoundException e){
			System.out.println("An error occurred. File not found.");
            e.printStackTrace();
		}
		catch (IOException i){
			System.out.println("An error occurred. IOException.");
            i.printStackTrace();
		}
	}

	/**
	 * This is the find state of the program
	 * This is called when the button "Find" is pressed
	 * This will have an error if no values are input.
	 * An error will occur if the value is already in the binary tree.
	 */
	public void findGUI(){

		String idName= JOptionPane.showInputDialog("Please enter student id (i.e. 66002):");

		try{
			Node root = tree.getRoot();
			Node found = tree.find(root, idName);
			JFrame frame = new JFrame("Student Info"); 
			JLabel label = new JLabel(found.toString());


			frame.add(label);
			frame.setBounds(620,300, 300,200);

			frame.setVisible(true);
		}
		catch (Exception e){
			System.out.println("An error occurred.");
            e.printStackTrace();
		}
	}

	/**
	 * insertGUI is used when the "insert" button is pressed.
	 * It prompts the user to input different values of the of a new student to be added to the binary tree.
	 */
	public void insertGUI(){

		String idName= JOptionPane.showInputDialog("Please enter student id (i.e. 62112):");
		String faculty= JOptionPane.showInputDialog("Please enter faculty (i.e. CC):").toUpperCase();
		String major= JOptionPane.showInputDialog("Please enter major (i.e. SCIE):").toUpperCase();
		String year= JOptionPane.showInputDialog("Please enter year (i.e. 2):").toUpperCase();
		try{
			tree.insert(idName, faculty, major, year);
		}
		catch (Exception e){
			System.out.println("An error occurred.");
            e.printStackTrace();
		}
	}
	

}