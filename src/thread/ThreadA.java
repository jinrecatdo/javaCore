package thread;

public class ThreadA extends ThreadC implements Runnable{
    public void run(){
        for (int i= 1;i<100;i++){
            System.out.println("hi" );
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
