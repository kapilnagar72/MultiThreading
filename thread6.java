package MultiThreading;

class Library implements Runnable {
    String res1 = new String("java");
    String res2 = new String("Dsa");
    String res3 = new String("html");

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("student1")) {
            try {
                Thread.sleep(1000);
                synchronized (res1) {
                    System.out.println("student1 is accessing java book: " + res1);
                }
                Thread.sleep(1000);
                synchronized (res2) {
                    System.out.println("student1 is accessing Dsa book: " + res2);
                }
                Thread.sleep(1000);
                synchronized (res3) {
                    System.out.println("student1 is accessing html book: " + res3);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        } else if (name.equals("student2")) {
            try {
                Thread.sleep(1000);
                synchronized (res2) {
                    System.out.println("student2 is accessing Dsa book: " + res2);
                }
                Thread.sleep(1000);
                synchronized (res3) {
                    System.out.println("student2 is accessing html book: " + res3);
                }
                Thread.sleep(1000);
                synchronized (res1) {
                    System.out.println("student2 is accessing java book: " + res1);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        } else if (name.equals("student3")) {
            try {
                Thread.sleep(1000);
                synchronized (res3) {
                    System.out.println("student3 is accessing html book: " + res3);
                }
                Thread.sleep(1000);
                synchronized (res1) {
                    System.out.println("student3 is accessing java book: " + res1);
                }
                Thread.sleep(1000);
                synchronized (res2) {
                    System.out.println("student3 is accessing Dsa book: " + res2);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class thread6 {
    public static void main(String[] args) {
        Library l = new Library();

        Thread t1 = new Thread(l);
        Thread t2 = new Thread(l);
        Thread t3 = new Thread(l);

        t1.setName("student1");
        t2.setName("student2");
        t3.setName("student3");

        t1.start();
        t2.start();
        t3.start();
    }
}
