import java.util.Scanner;
/**
 * ENSF 409 Summer 2021 
 * Assignment 1 Exercise 4
 * Student Name: Tsenguun Ulambayar, Jade Fjestad
 * This class was made as part of Assignment 1 Exercise 4 of
 * the course ENSF 409 Summer 2021. This class contains a 
 * 2D char array as an instance variable. It is used to
 * hold three rows of char arrays.
 */
public class MultiDimArray {
    /**
     * 2D char array that holds the formatted sentences as
     * three rows of char arrays. 
     */
    private char[][] threeSentences;

    /**
     * default constructor for class. initializes threeSentences
     * to be a 3x60 char array.
     */
    public MultiDimArray(){
        threeSentences = new char[3][60];
    }
    /**
     * contructor for MultiDimArray. Unused in this exercise.
     * @param c 2D char array
     */
    public MultiDimArray(char[][] c){
        threeSentences = c;
    }
    /**
     * setter method for threeSentences. Unused in this exercise.
     * @param c 2D char array
     */
    public void setThreeSentences(char[][] c){
        threeSentences = c;
    }
    /**
     * setter method for threeSentences. Unused in this exercise.
     * @return 2D char array
     */
    public char[][] getThreeSentences(){
        return threeSentences;
    }
    /**
     * readThreeSentencesIntoArray is a class method that prompts the user for
     * three sentences within 60 characters each. Then formats them according to
     * the assignment and fills the 2D char array, threeSentences, with the formatted
     * sentences.
     */
    public void readThreeSentencesIntoArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 sentences. Each less than 60 characters.");
        System.out.println("Enter the first sentence.");
        StringBuffer s1 = new StringBuffer(scan.nextLine());
        System.out.println("Enter the second sentence.");
        String[] s2 = (scan.nextLine()).split(" ");
        System.out.println("Enter the third sentence.");
        String s3 = scan.nextLine();
        
        //reverse sentence 1
        //Create char[] row1 with same size of sentence 1
        //copy sentence 1 to row1
        s1.reverse();
        char [] row1 = new char[s1.length()];
        for(int i = 0; i<row1.length; i++){
            row1[i] = s1.charAt(i);
        }

        //making temporary StringBuffer to put in s2 words in 
        //reverse order.
        StringBuffer temp = new StringBuffer();
        for(int i = (s2.length)-1; i>=0;i--){
            temp.append(s2[i]+" ");
        }

        //make temp into char[] row2
        char [] row2 = new char[temp.length()];
        for(int i = 0; i<row2.length; i++){
            row2[i] = temp.charAt(i);
        }
        
        //turn s3 into char array
        char [] row3 = s3.toCharArray();

        //capitalize letters with index divisible by 5
        for(int i = 0; i<row3.length; i++){
            if(i%5==0 && Character.isLetter(row3[i])){
                row3[i]=Character.toUpperCase(row3[i]);
            }
        }

        //send the three char arrays into the instance variable
        //char[][] threeSentences
        threeSentences[0] = row1;
        threeSentences[1] = row2;
        threeSentences[2] = row3;
        //print contents of threeSentences
        System.out.println("Printing the contents of the 2D array...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < threeSentences[i].length; j++) {
               System.out.print(threeSentences[i][j] + " ");
            }
            System.out.println();
         }
    }
    /**
     * main method is used to test readSentencesIntoArray by creating a new
     * MultiDimArray object and calling readThreeSentencesIntoArray method.
     * @param args
     */
    public static void main(String[]args){
        MultiDimArray twoDArray = new MultiDimArray();
        twoDArray.readThreeSentencesIntoArray();
        
    }

}