package MultiThreading;

public class thread2 {
    public static void main(String[] args) {
        System.out.println("main thread");
        System.out.println("Before changing");
        String name = Thread.currentThread().getName();
        System.out.println("main thread name " + name);
        System.out.println("current thread priority  " + Thread.currentThread().getPriority());
        
        System.out.println("After changing");
        Thread t = Thread.currentThread();
        t.setName("kalpu");
        t.getPriority();
        String name1 = Thread.currentThread().getName();
        System.out.println("main thread name " + name1);
        System.out.println("current thread priority " + Thread.currentThread().getPriority());
    }
}
