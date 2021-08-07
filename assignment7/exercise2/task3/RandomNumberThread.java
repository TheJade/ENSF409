//ENSF 409 Assignment 7, Exercise 2, Task 3

import java.util.concurrent.ThreadLocalRandom;


public class RandomNumberThread implements Runnable{
    private Numbers numberList;

    public RandomNumberThread(){
        numberList = new Numbers();
    }

    public void run(){
        int rn = ThreadLocalRandom.current().nextInt(1,101);
        numberList.addToRandomNumbers(rn);
        numberList.addSum(rn);
        System.out.print(rn+" ");
    }
}