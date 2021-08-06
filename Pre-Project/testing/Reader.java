import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
/**
 * This class just contains the readFile functionality of the program.
 * This is to be utilized once the .txt file name in inserted to populate the binary tree
 * 
 * @author Tsenguun Ulambayar, Jade Fjestad
 * @since August 5th, 2021
 * @version 1.0
 */
public class Reader {
    
    /**
     * This is the only method needed in this class. 
     * readFile method will populate the tree using the insert functionality of the BinSearchTree class.
     * Correct formatting of the .txt file is important 
     * @param fileName name of the file to populate the binary tree
     * @param tree the tree to be populated by the data
     */
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
                //  Node node = new Node("63459", "EN", "ENGO", "3");   //testing
//  
                //  print_tree(node);   

                //  System.out.print(id + " #1# "); //testing
                //  System.out.print(faculty + " #2# "); //testing
                //  System.out.print(major + " #3# "); //testing
                //  System.out.print(year + " #4# \n"); //testing
            }// 
            myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred. File not found.");
                e.printStackTrace();
            }
    }
    public static void main(String[] args) {    //for testing
        //Reader.readFile("input.txt");
    }

}
