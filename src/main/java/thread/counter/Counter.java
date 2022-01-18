package thread.counter;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Counter {

    private long count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public void inc() {
        try {
            lock.writeLock().lock();
            this.count++;
        } finally {
            lock.writeLock().unlock();
        }
    }

    public long getCount() {
        try {
            lock.readLock().lock();
            return this.count;
        } finally {
            lock.readLock().unlock();
        }
    }
}
