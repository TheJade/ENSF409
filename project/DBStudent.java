import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.ArrayList;

//This class is simulating a database for our
//program
public class DBStudent
 {
	private RandomAccessFile students;

	public DBStudent(){
		try{
			students = new RandomAccessFile("StudentList.txt", "rw");
		}catch(IOException e){
			e.getStackTrace();
		}

	}

	/*public void createDatabaseManual(){
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
	}*/

	public void createDatabaseAutomatic(){
		try{
			String name = "Sara Lamb";
			int id = 1;
			long studentFileSize = students.length();
			students.seek(studentFileSize);
			students.writeChars(name);
			for(int i=0; i<20-name.length();i++){
				students.writeByte(20);
			}
			students.writeInt(id);
		}catch(IOException e){
			e.getStackTrace();
		}

		try{
			String name = "John Doe";
			int id = 2;
			long studentFileSize = students.length();
			students.seek(studentFileSize);
			students.writeChars(name);
			for(int i=0; i<20-name.length();i++){
				students.writeByte(20);
			} 
			students.writeInt(id);
		}catch(IOException e){
			e.getStackTrace();
		}

	}

	public ArrayList<Student> readStudentsFromDB(){
		/*final int ROWBYTES = 44;//one record = firstname+lastname+id bytes
		long studentFileSize = students.length();
		students.seek(0);
		long numOfRows = studentFileSize/ROWBYTES;*/
		ArrayList<Student> studentArray = new ArrayList<Student>();
		return studentArray;
		
	}
	/*public Student readStudent(RandomAccessFile file, int lineStart, int lineEnd, int charsPerLine, String delimiter){
		String data = "";

		ArrayList<String> dialogLinesRead = new ArrayList<String>();
		int bytesPerLine = charsPerLine+2;
		try{
    
			for(int i = lineStart; i<lineEnd; i++){
				RandomAccessFile.seek(bytesPerLine*i);
				data = RandomAccessFile.readLine();
				dialogLinesRead.add(data);
			}
		
			
		}catch(Exception e){
			System.out.println("Error occured.");
		}

	}*/

	

}
