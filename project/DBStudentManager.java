import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.ArrayList;

//This class is simulating a database for our
//program
public class DBStudentManager {
	private RandomAccessFile students;

	public DBStudentManager () {
		try{
			students = new RandomAccessFile("StudentList.txt", "rw");
		}catch(IOException e){
			e.getStackTrace();
		}

	}

	public void createDatabaseManual(){
		Scanner scan = new Scanner(System.in);

		String firstname, lastname;
		int id;

		System.out.println("Enter student's first name.");
		firstname = scan.nextLine();
		System.out.println("Enter student's last name.");
		lastname = scan.nextLine();
		System.out.println("Enter student's id number.");
		id = scan.nextInt();

		try{
			//students = new RandomAccessFile("StudentList.txt", "rw");
		}catch(IOException e){
			e.getStackTrace();
		}
	}

	public void createDatabaseAutomatic(){
		try{
			String firstname = "Sara";
			String lastname = "Lamb";
			int id = 1;
			long studentFileSize = students.length();
			students.seek(studentFileSize);
			students.writeChars(firstname);
			for(int i=0; i<20-firstname.length();i++){
				students.writeByte(20);
			}
			students.writeChars(lastname);
			for(int i=0; i<20-lastname.length();i++){
				students.writeByte(20);
			}
			students.writeInt(id);
		}catch(IOException e){
			e.getStackTrace();
		}

		try{
			String firstname = "John";
			String lastname = "Doe";
			int id = 2;
			long studentFileSize = students.length();
			students.seek(studentFileSize);
			students.writeChars(firstname);
			for(int i=0; i<20-firstname.length();i++){
				students.writeByte(20);
			}
			students.writeChars(lastname);
			for(int i=0; i<20-lastname.length();i++){
				students.writeByte(20);
			}
			students.writeInt(id);
		}catch(IOException e){
			e.getStackTrace();
		}

	}

	public ArrayList<Student> readStudentFromDB(){
		final int ROWBYTES = 44;//one record = firstname+lastname+id bytes
		long studentFileSize = students.length();
		students.seek(0);
		long numOfRows = studentFileSize/ROWBYTES;

		
		
		
	}
	

	

}
