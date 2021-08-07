//ENSF 409 Assignment 7, Exercise 2, Task 3
import java.util.ArrayList;
public class Numbers {
    static ArrayList<Integer> randomNumbers;
    static int sum;

    public Numbers(){
        sum = 0;
        randomNumbers = new ArrayList<Integer>();
    }
    public ArrayList<Integer> getRandomNumbers(){
        return randomNumbers;
    }
    public void addSum(int n){
        sum += n;
    }
    public int getSum(){
        return sum;
    }

    synchronized public void addToRandomNumbers(int n){
        randomNumbers.add(n);
    }
}
