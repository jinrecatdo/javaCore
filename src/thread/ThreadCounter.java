package thread;

public class ThreadCounter {
    int count;
    public synchronized void increment(){// one thread work with
        count++;
    }
}
