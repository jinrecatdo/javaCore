package thread;

public class ThreadMuntation {
    public static void main(String[] args) throws InterruptedException {
        ThreadCounter c = new ThreadCounter();
        Runnable r2 = () -> { // lambda
            for (int i= 1;i<100;i++) {
                System.out.println("hi" + i +" "+ c.count );
                c.increment();
            }
        };
        Runnable r3 = () -> { // lambda
            for (int i= 1;i<100;i++) {
                System.out.println("Hi" + i + " "+  c.count);
                c.increment();
            }
        };
        Thread t1 = new Thread(r2);
        Thread t2 = new Thread(r3);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
