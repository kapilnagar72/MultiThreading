package MultiThreading;

import java.util.Scanner;

class CalculationThread extends Thread {
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

class MessageThread extends Thread {
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

class PrintingThread extends Thread {
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

public class thread4 {
    public static void main(String[] args) {
        System.out.println("Main thread start");
        CalculationThread calculationThread = new CalculationThread();
        MessageThread messageThread = new MessageThread();
        PrintingThread printingThread = new PrintingThread();

        calculationThread.start();
        messageThread.start();
        printingThread.start();
    }
}
