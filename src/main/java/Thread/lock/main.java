package Thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class main {

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        Thread1 thread1 = new Thread1(deadLock);
        Thread0 thread0 = new Thread0(deadLock);
        thread0.start();
        thread1.start();
        Lock lock = new ReentrantLock();

    }
}
