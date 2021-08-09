import java.awt.*;
import javax.swing.*;
import java.io.*;


/**
 * This class contains the methods used to produce the GUI for the user
 * 
 * @author Tsenguun Ulambayar, Jade Fjestad
 * @since August 5th, 2021
 * @version 1.0
 */

public class GUIStudent extends JFrame{

    String studentName;
    static int[] state = new int[]{1};   //array so it gets past by reference, need to make it no longer static, if changed modify B1listener.java files

    public GUIStudent(){
        super("MainMenu");  //name of frame
        //can add the data here
    }

    public static void main(String[] args){
        // this while (true) will be replicated in the client 
        GUIStudent test = new GUIStudent(); //student is created
        test.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        while (true){   
            //System.out.print(state[0]);
            System.out.print("");   //idk why this line is needed but it only works with it in here, lol
            if (state[0] == 0){
                //wait state
            }
            else if (state[0] == 1){    //startup
                test.studentName = test.studentNameInput();
            }
            else if (state[0] == 2){
                test.mainMenu();
                state[0] = 0;
            }
            else if (state[0] == 3){
                test.classesTaken();
            }
            else if (state[0] == 4){
                test.catalogueGUI();
            }
            
        }
        
    }

    public String studentNameInput(){    //starts with this
        try{
            String studentName= JOptionPane.showInputDialog("Please enter your full name or student id: ");
            //should check if student is registered, if not registered throws Exception

            state[0] = 2;  //goes to mainMenu if student found
            return studentName;
        }
        catch (Exception e){
            System.out.println("Student name not found");
            e.printStackTrace();
            return "NULL";
        }
    }

    public void mainMenu(){
        
        
        try {

            JButton b1, b2;
            JPanel p1, p2;
            
			b1 = new JButton ("Classes taken");
			b2 = new JButton ("Class Catalogue");

            p1 = new JPanel(new GridBagLayout());    //test
            p2 = new JPanel(new GridBagLayout());    //test
            GridBagConstraints c = new GridBagConstraints();

            c.insets = new Insets(10, 10, 10, 10);
			c.gridx = 0;
			c.gridy = 1;
			p1.add(b1, c); 

			c.gridx = 1;
			c.gridy = 1;  
			p1.add(b2, c);

            add(p1, BorderLayout.SOUTH);


            JLabel label1 = new JLabel("Name: " + studentName);
            JLabel label2 = new JLabel("ID:  A student ID");

            c.insets = new Insets(3, 3, 3, 3);
            c.gridx = 0;
			c.gridy = 0;  
			p2.add(label1, c);

            c.gridx = 0;
			c.gridy = 1;  
			p2.add(label2, c);
            add(p2, BorderLayout.NORTH);

            JTextArea area = new JTextArea("Currently enrolled in:\n" + "STRING OF ALL COURSE STUDENT IS IN");
            area.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(area);	
			add(scrollPane);

            setVisible(true);
			setBounds(300,300, 300, 200);

            b1.addActionListener(new B1Listener(state));
            b2.addActionListener(new B2Listener(state));

            

            //need to add listeners to buttons
        }
        catch (Exception e){
            System.out.println("Student name not found");
            e.printStackTrace();
        }
    }

    public void classesTaken(){ //can't figure out how to close a frame
        
    
        try {
            setVisible(false);  //hides mainMenu
            JFrame f = new JFrame("Classes Taken"); //student is created
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JButton b3;
            JPanel p1, p2;
            
			b3 = new JButton ("Back");

            p1 = new JPanel(new GridBagLayout());    //test
            p2 = new JPanel(new GridBagLayout());    //test
            GridBagConstraints c = new GridBagConstraints();

            c.insets = new Insets(10, 10, 10, 10);
			c.gridx = 0;
			c.gridy = 1;
			p1.add(b3, c); 

            f.add(p1, BorderLayout.SOUTH);


            JLabel label1 = new JLabel("Classes Taken");

            c.insets = new Insets(3, 3, 3, 3);
            c.gridx = 0;
			c.gridy = 0;  
			p2.add(label1, c);

            f.add(p2, BorderLayout.NORTH);

            JTextArea area = new JTextArea("STRING OF CLASSES TAKEN");
            area.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(area);	
			f.add(scrollPane);

            f.setVisible(true);
			f.setBounds(300,300, 300,200);

            b3.addActionListener(new B3Listener(state, f));

            GUIStudent.state[0] = 0;
        }
        catch (Exception e){
            System.out.println("Student name not found");
            e.printStackTrace();
        }
    }

    public void catalogueGUI(){ //can't figure out how to close a frame
        
    
        try {
            setVisible(false);  //hides mainMenu
            JFrame f = new JFrame("Course Catalogue"); //student is created
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JButton b2, b4;
            JPanel p1, p2;
            
			b2 = new JButton ("Back");
            b4 = new JButton ("Register for Class");

            p1 = new JPanel(new GridBagLayout());    //test
            p2 = new JPanel(new GridBagLayout());    //test
            GridBagConstraints c = new GridBagConstraints();

            c.insets = new Insets(10, 10, 10, 10);
			c.gridx = 0;
			c.gridy = 1;
			p1.add(b2, c); 
            c.gridx = 1;
			c.gridy = 1;
			p1.add(b4, c); 

            f.add(p1, BorderLayout.SOUTH);


            JLabel label1 = new JLabel("Classes available: ");

            c.insets = new Insets(3, 3, 3, 3);
            c.gridx = 0;
			c.gridy = 0;  
			p2.add(label1, c);

            f.add(p2, BorderLayout.NORTH);

            JTextArea area = new JTextArea("STRING OF CLASSES AVAILABLE");
            area.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(area);	
			f.add(scrollPane);

            f.setVisible(true);
			f.setBounds(300,300, 300,200);

            b2.addActionListener(new B3Listener(state, f));
            b4.addActionListener(new B4Listener());

            GUIStudent.state[0] = 0;
        }
        catch (Exception e){
            System.out.println("Student name not found");
            e.printStackTrace();
        }
    }


}

//extend dialogue
