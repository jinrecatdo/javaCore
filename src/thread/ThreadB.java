package thread;

public class ThreadB extends Thread{
    public void run(){
    for (int i= 1;i<100;i++){
        System.out.println("hello" );
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
}
