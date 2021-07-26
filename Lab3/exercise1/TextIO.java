/**
 * this class manages the read and write of the .txt documents
 */

import java.io.*;
import java.lang.*;

public class TextIO {
    
    Tool[] tools = new Tool[5]; //modify after testing
    public TextIO(Tool[] inv_tools){
        tools = inv_tools;
        tools[0] = new Tool("a", "b", "c", "d", "e", "f", "g", "h");
        System.out.println(tools[0].getID());
    }

    /**
     * this goes through the .txt doc and populate the tool objects to so that the program can use them
     * @param tools reads the best
     * @throws IOException
     */

    public void readItems(Tool[] tools) throws IOException{

        BufferedReader in = null;

        try {
            File file = new File("items.txt");

            in = new BufferedReader(new FileReader(file));

            String st;
            int tool_index = 0;
            while (in.readLine() != null){
                st = in.readLine();
                int j = 0;
                StringBuilder word = new StringBuilder("");
                for (int i = 0; i < st.length(); i++){     
                    if (st.charAt(i) != ";".charAt(0)){
                        word.append(st.charAt(i));
                        // System.out.println(st.charAt(i)); // testing
                        // System.out.println(j); // testing
                        // System.out.println(word.toString()); // testing
                        // System.out.println("----------"); // testing
                    }
                    else {
                        tools[tool_index].setValue(j, word.toString());    
                        System.out.println(word);
                        word = new StringBuilder("");
                        j += 1;
                    }

                }
                tools[tool_index].setValue(j, word.toString());   

                tool_index++;  
            }
            System.out.println(tools[0].getID());

        } 
        catch(FileNotFoundException n){
            System.out.print("file not found");
        }
        finally{
            if (in != null)  {
                try{
                    in.close();
                } catch(IOException e){
                    System.out.print("error closing file");

                }
            }
        }
    }

    public void readSuppliers(Tool[] tools) throws IOException{

        BufferedReader in = null;

        try {
            File file = new File("suppliers.txt");

            in = new BufferedReader(new FileReader(file));

            String st;
            int tool_index = 0;
            while (in.readLine() != null){
                st = in.readLine();
                int j = 0;
                StringBuilder word = new StringBuilder("");
                for (int i = 0; i < st.length(); i++){     
                    if (st.charAt(i) != ";".charAt(0)){
                        word.append(st.charAt(i));
                    }
                    else {
                        tools[tool_index].setValue(j, word.toString());    
                        System.out.println(word);
                        word = new StringBuilder("");
                        j += 1;
                    }

                }
                tools[tool_index].setValue(j, word.toString());   

                tool_index++;  
            }
            System.out.println(tools[0].getID());

        } 
        catch(FileNotFoundException n){
            System.out.print("file not found");
        }
        finally{
            if (in != null)  {
                try{
                    in.close();
                } catch(IOException e){
                    System.out.print("error closing file");

                }
            }
        }
    }


    //main for testing
    public static void main(String[] args) throws IOException{

        BufferedReader in = null;

        Tool[] tools = new Tool[100]; //modify after testing
        tools[0] = new Tool("a", "b", "c", "d", "e", "f", "g", "h");    //modify after testing

        try {
            File file = new File("items.txt");

            in = new BufferedReader(new FileReader(file));

            String st;
            int tool_index = 0;
            while (in.readLine() != null){
                st = in.readLine();
                int j = 0;
                StringBuilder word = new StringBuilder("");
                for (int i = 0; i < st.length(); i++){     
                    if (st.charAt(i) != ";".charAt(0)){
                        word.append(st.charAt(i));
                        // System.out.println(st.charAt(i)); // testing
                        // System.out.println(j); // testing
                        // System.out.println(word.toString()); // testing
                        // System.out.println("----------"); // testing
                    }
                    else {
                        tools[tool_index].setValue(j, word.toString());    // i can't figure out this error, maybe it will fix itself when not using main class
                        System.out.println(word);
                        word = new StringBuilder("");
                        j += 1;
                    }
                    
                }
                tools[tool_index].setValue(j, word.toString());    // i can't figure out this error, maybe it will fix itself when not using main class
                System.out.println(word);

                //  tool_index++;       //!!!!!!!!!!add this after testing
            }
            //st = in.readLine();
            //fileContent.append(st);
            System.out.println(tools[0].getID());
            
        } 
        catch(FileNotFoundException n){
            System.out.print("file not found");
        }
        finally{
            if (in != null)  {
                try{
                    in.close();
                } catch(IOException e){
                    System.out.print("error closing file");

                }
            }
        }
    }
    
    
}   // end of textIO
