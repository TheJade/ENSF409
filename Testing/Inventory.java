

public class Inventory {
    
    Tool[] tools = new Tool[5]; //modify after testing
    IOtext IO = new IOtext(tools);
    
    public Inventory(){
        System.out.println("hi" + tools[0].getID());
    }

    
    
}