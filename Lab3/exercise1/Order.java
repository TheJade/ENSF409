import java.util.ArrayList;  
import java.util.Arrays;  
import java.lang.Math;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
/**
 *  This class is used to create the order to be made at the end of the day to order more parts to the store
 */
public class Order {
    // provides a string file to IOText to be put into a new .txt doc
    /**
     * This is the only method, it uses the tool's attributes to get the info needed to complete the order
     * @param tools
     * @return
     */
    public String makeOrder(Tool[] tools)    {

        ArrayList<Integer> needMoreOf = new ArrayList<Integer>();    
        //arr = arrayList.toArray(arr); 
        String order = "*********************************************************************\n ORDER ID:         ";

        order = order + String.valueOf(floor(Math.random() * 99999));  // this generates the random 5 digit number

        for (int i = 0; i < tools.length; i++){
            if (Integer.parseInt(tools[i].getQuantity()) < 40){
                needMoreOf.add(i);   //returns the index the tool is at
            }
        }

        order = order + "\n Date Ordered:       ";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        order = order + dtf.format(now);

        Integer[] arr = new Integer[needMoreOf.size()];
        arr = needMoreOf.toArray(arr);

        for (int i = 0; i < needMoreOf.length; i++){
            order = order + "\n\n Item description:       " + tools[arr[i]].getName();
            order = order + "\n Amount ordered:     " + String.valueOf(50 - Integer.parseInt(tools[arr[i]].getQuantity()));
            order = order + "\n Supplier:         " + tools[arr[i]].getCompany() + "\n";
        }

        return order;



    }
}
