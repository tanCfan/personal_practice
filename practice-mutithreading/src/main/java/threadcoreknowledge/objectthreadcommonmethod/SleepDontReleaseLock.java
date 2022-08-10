package threadcoreknowledge.objectthreadcommonmethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SleepDontReleaseLock implements Runnable {

    private static final Lock LOCK = new ReentrantLock();

    @Override
    public void run() {

        try {
            LOCK.lock();
            System.out.println(Thread.currentThread().getName() + " lock and run");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " wake up and run ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            LOCK.unlock();
        }
    }

    public static void main(String[] args) {
        SleepDontReleaseLock sleepDontReleaseLock = new SleepDontReleaseLock();
        Thread threadA = new Thread(sleepDontReleaseLock);
        Thread threadB = new Thread(sleepDontReleaseLock);

        threadA.start();
        threadB.start();
    }
}
