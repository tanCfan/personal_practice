package jucknowledge.atomic;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceDemo implements Runnable {

    private AtomicReference<Thread> sign = new AtomicReference<>();

    public void lock () {
        Thread thread = Thread.currentThread();
        while (!sign.compareAndSet(null, thread)) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName() + " try get lock");
        }
    }

    public void unLock () {
        Thread thread = Thread.currentThread();
        if (sign.compareAndSet(thread, null)) {
            System.out.println(thread.getName() + " unlock ");
        }
    }


    @Override
    public void run() {
        doSomething();
    }

    public void doSomething () {
        lock();
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is working");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        unLock();
        System.out.println(threadName + " finished work");
    }

    public static void main(String[] args) {
        AtomicReferenceDemo atomicReferenceDemo = new AtomicReferenceDemo();
        Thread t1 = new Thread(atomicReferenceDemo);
        Thread t2 = new Thread(atomicReferenceDemo);

        t1.start();
        t2.start();
    }
}
