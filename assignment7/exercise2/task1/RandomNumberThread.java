//ENSF 409 Assignment 7, Exercise 2, Task 1

import java.util.concurrent.ThreadLocalRandom;
public class RandomNumberThread implements Runnable{
    private int number;

    public int getNumber(){
        return number;
    }
    public void run(){
        number = ThreadLocalRandom.current().nextInt(1,101);
        System.out.print(number+" ");
        
    }
    public static void main(String [] args){
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
        int sum = r1.number + r2.number + r3.number + r4.number + r5.number;
        System.out.println("The sum of 5 random numbers is: "+ sum);
    }
}