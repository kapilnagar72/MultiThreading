package MultiThreading;

import java.util.Scanner;

class CalculationThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Calculation task start");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter the 1st number:");
            int num1 = scanner.nextInt();
            System.out.println("Please enter the 2nd number:");
            int num2 = scanner.nextInt();

            int result = num1 + num2;
            System.out.println("Result: " + result);
        }
        System.out.println("************************************");
    }
}

class MessageThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Display important message task");
        for (int i = 0; i < 5; i++) {
            System.out.println("Please try again");
        }
        System.out.println("Display important message task end");
        System.out.println("*********************************************");
    }
}

class PrintingThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing task start");
        for (int i = 0; i < 4; i++) {
            System.out.println("**");
        }
        System.out.println("Printing task end");
        System.out.println("***************************************");
    }
}

public class thread5 {
    public static void main(String[] args) {
        System.out.println("Main thread start");
        CalculationThread c1 = new CalculationThread();
        MessageThread m1= new MessageThread();
        PrintingThread p1 = new PrintingThread();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m1);
        Thread t3 = new Thread(p1);
        t1.start();
        t2.start();
        t3.start();
    }
}
