import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.io.RandomAccessFile;
import java.util.Scanner;
public class SimpleGUI
{
	public static void main(String[] args)
	{
		File fin= new File("test.dat");
		RandomAccessFile ra=null;
		Scanner scan= new Scanner(System.in);
		System.out.println(fin.exists());
		if(!fin.exists() || !fin.isFile())
		{
			try{
				ra= new RandomAccessFile("test.dat","rw");
				for(int i=0;i<10;i++)
				{
					System.out.println("Input name, age, and hourly wage");
					String nameip= scan.nextLine();
					StringBuffer name= new StringBuffer(nameip);
					name.setLength(10);
					ra.writeChars(name.toString());
					int age=Integer.parseInt(scan.nextLine());
					ra.writeInt(age);
					double wage=Double.parseDouble(scan.nextLine());
					ra.writeDouble(wage);
					System.out.println("end of record entry");
				}
			}
			catch(IOException e){
				System.out.println("error opening file");
			}
			try{
				ra.close();
			}catch(IOException e){
				System.out.println("error closing file");
			}
		}
				
		JFrame f = new JFrame ("Hello World");
		f.setSize (200,200);
		//f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JButton b = new JButton ("Hello");
		JButton b2 = new JButton ("Hello 2");
		JButton b3 = new JButton ("Hello 3");
		
		p.add(b);// add button to panel
		p2.add(b2);// add button to panel
		p3.add(b3);// add button to panel
		//f.add(p);
		//f.add(p2);
		//f.add(p3);
		f.add(p,BorderLayout.CENTER); // add panel to frame
		f.add(p2,BorderLayout.WEST);
		f.add(p3,BorderLayout.EAST);
		
		f.setVisible(true);
		JOptionPane.showMessageDialog(f,"first trial", "Error Message",JOptionPane.QUESTION_MESSAGE);
		String fname= JOptionPane.showInputDialog("Please enter file name with extension:");
		//System.out.println("value entered: "+ num);
		
		
		
		try{
		
			//ra= new RandomAccessFile("test.dat","rw");
			ra= new RandomAccessFile(fname,"rw");
			int recsize= 10*Character.BYTES+ Integer.BYTES + Double.BYTES;
			System.out.println("record size is "+ recsize);
			System.out.println("current file pointer position "+ ra.getFilePointer());
			System.out.println("moving pointer to 5th position");
			ra.seek(4*recsize);
			System.out.println("current file pointer position"+ ra.getFilePointer());
			char scanName[]= new char[10];
			for (int i=0;i<10;i++)
				scanName[i]=ra.readChar();
			String outname= new String(scanName);
			System.out.println("record content is: name-> "+outname+" age->"+ ra.readInt()+" wage->"+ra.readDouble());
			
		}
		catch(IOException e){
			System.out.println("error opening file");	
		}
		
		try{
			ra.close();
		}catch(IOException e){
			System.out.println("error closing file");
		}

	}
}