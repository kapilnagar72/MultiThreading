package MultiThreading;

import java.util.Scanner;

public class thread1 {

    public static void main(String[] args) {
        System.out.println("cal task start");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the 1st num");
        int num1 = sc.nextInt();

        System.out.println("please enter the 2nd num");
        int num2 = sc.nextInt();
        
        int cal = num1 + num2;
        System.out.println(cal);
        
        System.out.println("*************************************");

        System.out.println("printing task start");
        for (int i = 0; i < 4; i++) {
            System.out.println("**");
        }
        System.out.println("printing task end");

        System.out.println("***************************************");

        System.out.println("display important message task");
        for (int i = 0; i < 5; i++)
        {
            System.out.println("please try again");
        }

        System.out.println("display important message task end");

        System.out.println("*********************************************");
    }
}
