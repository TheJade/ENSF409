import java.util.LinkedList;
/**
 * SimpleList is a class made for ENSF 409 Assignment 1 Exercise 7. 
 * This class uses LinkedList to translate a C++ program into java. 
 * It contains one instance variable which is an integer LinkedList.
 * The main method calls LinkedList class methods and SimpleList class methods
 * to produce the same output as the original C++ program.
 * 
 * @author Tsenguun Ulambayar, Jade Fjestad
 * @version 1.0
 * @since July 11, 2021
 */
public class SimpleList {
    /**
     * Holds the list of integers that the member methods, including main,
     * uses.
     */
    private LinkedList<Integer> linkedList;
    /**
     * Default constructor that connects linkedList to a new
     * integer LinkedList object.
     */
    public SimpleList(){
        linkedList = new LinkedList<Integer>();
    }
    /**
     * Prints the contents of the private instance variable, 
     * linkedList.
     */
    public void printList(){
        for(Integer i: linkedList ){
            System.out.print(Integer.toString(i)+" ");
        }
        System.out.println();
    }
    /**
     * Adds integer at a given index into the instance variable, linkedList, 
     * only if index is greater than or equal to 0, and is
     * less than or equal to the size of linkedList.
     * @param item integer that you want to insert into linkedList
     * @param index index at which you want to insert the given integer
     */
    public void insert(int item, int index){
        if(index>0 && index<linkedList.size()){
            linkedList.add(index,item);
        }
        if(index==linkedList.size()){
            linkedList.addLast(item);
        }
        if(index==0){
            linkedList.addFirst(item);
        }
        
    }
    /**
     * Checks if the given integer is a valid index in the 
     * instance variable, linkedList. If it is a valid index, the 
     * element at that index will be removed.
     * @param index index of the element of linkedList you want to remove
     */
    public void checkAndRemove(int index){
        if(index>=0 && index<linkedList.size()){
            linkedList.remove(index);
        }
    }
    /**
     * main creates a new SimpleList object.
     * main uses LinkedList methods and SimpleList class methods to 
     * manipulate the private data field, linkedList, and print
     * an output that matches that of the original C++ program.
     * @param args ignored command line argument
     */
    public static void main(String[]args){
        SimpleList list = new SimpleList();
        System.out.println("List just after creation -- is empty.");
        
        list.linkedList.addFirst(50);//list.push_front(50);
        System.out.println("After calling push_front, list must have: 50");
        list.printList();//print(list);

        list.linkedList.addLast(440);//list.push_back(440);

        list.linkedList.set(0,770);//list.set(0,770);
        System.out.println("After calling push_back and set function, list must "+
        "have: 770 440");
        list.printList();//print list

        list.linkedList.addLast(330);//list.push_back(330);
        list.linkedList.addLast(220);//list.push_back(220);
        list.linkedList.addLast(110);//list.push_back(110);

        System.out.println("After three more calls to push_back, list must have: "+
        "770 440 330 220 110");
        list.printList();//print list

        list.linkedList.remove(0);//list.remove(0);
        list.linkedList.remove(2);//list.remove(2);
        System.out.println("After removing two nodes, list must have: "+
        "440 330 110");
        list.printList();//print list
        list.insert(40,3);//list.insert(40,3);
        list.insert(20,-1);//list.insert(20,-1);//does nothing
        list.insert(30,30000);//list.insert(30,30000);//does nothing
        list.insert(10,0);//list.insert(10,0);
        list.insert(33,2);//list.insert(33,2);

        System.out.println("Two more nodes inserted, list must have: 10 440 "+
        "33 330 110 40");
        list.printList();//print list

        list.checkAndRemove(0);//list.remove(0);
        list.checkAndRemove(1);//list.remove(1);
        list.checkAndRemove(2);//list.remove(2);
        list.checkAndRemove(3);//list.remove(3);
        list.checkAndRemove(4);//list.remove(4);
        list.checkAndRemove(5);//list.remove(5);
        System.out.println("After 6 removes, list must have: "+
        "440 330 40");
        list.printList();//print list

        list.linkedList.clear(); //list.clear();
        System.out.println("After call to clear, list must be empty:");
        list.printList();//print list

        list.linkedList.addLast(331);//list.push_back(331);
        list.linkedList.addLast(221);//list.push_back(221);
        list.linkedList.addLast(111);//list.push_back(111);

        System.out.println("After three calls to push_back, list must have: "+
        "331 221 111");
        list.printList();
    }
}
