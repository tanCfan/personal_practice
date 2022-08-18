package jucknowledge.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo implements Runnable {

    public static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static Integer integer = new Integer(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            atomicInteger.getAndIncrement();
            integer++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicIntegerDemo atomicIntegerDemo = new AtomicIntegerDemo();

        Thread t1 = new Thread(atomicIntegerDemo);
        Thread t2 = new Thread(atomicIntegerDemo);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(atomicInteger.get());
        System.out.println(integer);
    }
}
