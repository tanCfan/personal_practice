package jucknowledge.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicArrayDemo {

    private static AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(1000);

    public static void main(String[] args) throws InterruptedException {
        Thread[] addThreads = new Thread[50];
        Thread[] subThreads = new Thread[50];

        for (int i = 0; i < 50; i++) {
            addThreads[i] = new Thread(new ArrayIncrement(atomicIntegerArray));
            subThreads[i] = new Thread(new ArrayDecrement(atomicIntegerArray));
            addThreads[i].start();
            subThreads[i].start();
        }


        for (int i = 0; i < 50; i++) {
            addThreads[i].join();
            subThreads[i].join();
        }


        for (int i = 0; i < 1000; i++) {
            if (atomicIntegerArray.get(i) != 0) {
                System.out.println("程序出错拉");
            }
        }

        System.out.println("程序运行结束");
    }
}


class ArrayIncrement implements Runnable {

    private AtomicIntegerArray atomicIntegerArray;

    public ArrayIncrement (AtomicIntegerArray atomicIntegerArray) {
        this.atomicIntegerArray = atomicIntegerArray;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            atomicIntegerArray.getAndIncrement(i);
        }
    }
}

class ArrayDecrement implements Runnable {

    private AtomicIntegerArray atomicIntegerArray;

    public ArrayDecrement (AtomicIntegerArray atomicIntegerArray) {
        this.atomicIntegerArray = atomicIntegerArray;
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            atomicIntegerArray.getAndDecrement(i);
        }
    }
}