import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Reader {
    
    public static void readFile(String fileName, BinSearchTree tree) {
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String id = "";
                String faculty = "";
                String major = ""; 
                String year = "";
                String data = myReader.nextLine();
                //System.out.println(data); //testing
                for (int i = 0; i < data.length(); i++){
                    if (data.charAt(i) != " ".charAt(0) && i < 10){
                        id = id + data.charAt(i);
                    }
                    else if (data.charAt(i) != " ".charAt(0) && i < 15 ){
                        faculty = faculty + data.charAt(i);
                    }
                    else if (data.charAt(i) != " ".charAt(0) && i < 25){
                        major = major + data.charAt(i);
                    }
                    else if (data.charAt(i) != " ".charAt(0)){
                        year = year + data.charAt(i);
                    }
                }

                //add the thing to binsearchTree here

                tree.insert(id, faculty, major, year);

                //testing
                //  Node node = new Node("63459", "EN", "ENGO", "3");
//  
                //  print_tree(node);   

                System.out.print(id + " #1# "); //testing
                System.out.print(faculty + " #2# "); //testing
                System.out.print(major + " #3# "); //testing
                System.out.print(year + " #4# \n"); //testing
            }// 
            myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred. File not found.");
                e.printStackTrace();
            }
    }
    public static void main(String[] args) {
        //Reader.readFile("input.txt");
    }

}
