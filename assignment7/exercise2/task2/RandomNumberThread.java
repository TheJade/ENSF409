//ENSF 409 Assignment 7, Exercise 2, Task 2

import java.util.concurrent.ThreadLocalRandom;


public class RandomNumberThread implements Runnable{
    private Numbers numberList;

    public RandomNumberThread(){
        numberList = new Numbers();
    }

    public void run(){
        numberList.addToRandomNumbers(ThreadLocalRandom.current().nextInt(1,101));
    }

    public static void main(String [] args){
        Numbers numbers = new Numbers();

        RandomNumberThread r1 = new RandomNumberThread();
        RandomNumberThread r2 = new RandomNumberThread();
        RandomNumberThread r3 = new RandomNumberThread();
        RandomNumberThread r4 = new RandomNumberThread();
        RandomNumberThread r5 = new RandomNumberThread();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);
        Thread t5 = new Thread(r5);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try{
            System.out.print("5 random numbers: ");
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();

        }catch(InterruptedException e){
            System.err.println(e.toString());
        }
        
        System.out.println();
        int sum = 0;
        for (int i=0; i<numbers.getRandomNumbers().size();i++){
            sum += numbers.getRandomNumbers().get(i);
        }
        System.out.println("The sum of 5 random numbers is: "+ sum);
    }
}