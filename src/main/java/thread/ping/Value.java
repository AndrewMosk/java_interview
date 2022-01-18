package thread.ping;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Value {

    private final Lock lock = new ReentrantLock();

    public void printValue(String v) {
        lock.lock();
        System.out.println(v);
        lock.unlock();
    }
}
