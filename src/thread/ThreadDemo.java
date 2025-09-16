package thread;

public class ThreadDemo {
    public static void main(String[] args){
        Runnable r1 = () -> { // lambda
                for (int i= 1;i<100;i++) {
                    System.out.println("chao");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };
        Runnable ta = new ThreadA();
        ThreadB tb = new ThreadB();
//        ta.setPriority(Thread.MAX_PRIORITY);
        Thread t1 = new Thread(ta);
        Thread t2 = new Thread(r1);

        t1.start();
        tb.start();
        t2.start();
    }
}
