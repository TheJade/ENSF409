/**
 * This is a program to manage the inventory of a fictional store. 
 * Text documents are used to convey the tools' info.
 * Additionally, an order form is used to print out an order for new parts if the inventory gets too low.
 * 
 * Inventory class is the backbone of the program.
 * It contains the major functions used for searching and managing the inventory of the shop
 
 * @author Tsenguun and Jade
 * @since July 11, 2021
 * */

public class Inventory {
    /**
     * tools will be an array of objects of class Tool.
     * the tools hold all the info and provide the methods to change and get that info
     */
    Tool[] tools = new Tool[100]; //modify after testing
    /**
     * 
     * @param toolName of tool
     * @return index of tool found with that name, returns -1 if not found
     */
    public int searchToolName(String toolName)   {

        for (int i = 0; i < tools.length; i++){
            if (toolName.upperCase() == tools[i].getName().upperCase()){
                return i;   //returns the index the tool is at
            }
        }
        return -1;   // tool not found
    }

    /**
     * 
     * @param toolID to be searched
     * @return  index of tool found with that ID, returns -1 if not found
     */
    public int searchToolID(String toolID)   {

        for (int i = 0; i < tools.length; i++){
            if (toolID.upperCase() == tools[i].getID().upperCase()){
                return i;   //returns the index the tool is at
            }
        }
        return -1;   // tool not found
    }

    /**
     * 
     * @param tool name or id will work for the search
     * @return  return quantity of the tool in stock
     */
    public int itemQuantity(String tool)   {

        for (int i = 0; i < tools.length; i++){
            if (tool.upperCase() == tools[i].getName().upperCase() || tool.upperCase() == tools[i].getID().upperCase()){    //works for both id and name
                return Integer.parseInt(tools[i].getQuantity());   //gets quantity value   
            }
        }
        return -1;   // tool not found
    }

    public int decreaseQuantity(String tool)   {

        for (int i = 0; i < tools.length; i++){
            if (tool.upperCase() == tools[i].getName().upperCase() || tool.upperCase() == tools[i].getID().upperCase()){    //works for both id and name
                return tools[i].setValue(3, Integer.parseInt(tools[i].getQuantity()) - 1);   //decreasesQuantity value by 1 
            }
        }
        return -1;   // tool not found
    }

    public void addTool(String a , String b, String c, String d, String e, String f, String g, String h)  {
        //this method needs to be finished  
    }

    public int removeTool(String tool)  {
        boolean found = false;
        for (int i = 0; i < tools.length; i++){
            
            if (tool.upperCase() == tools[i].getName().upperCase() || tool.upperCase() == tools[i].getID().upperCase() || found){    //works for both id and name
                tools[i] = tool[i+1];
                found = true;
            }
        }
        
    }

}
