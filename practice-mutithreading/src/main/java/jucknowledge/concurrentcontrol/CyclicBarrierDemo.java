package jucknowledge.concurrentcontrol;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("所有人都到咯，开会吧");
            }
        });

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 9; i++) {
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    String threadName = Thread.currentThread().getName();
                    System.out.println(threadName + " 出发开会");
                    try {
                        Thread.sleep(500);
                        System.out.println(threadName + " 到达会场等待开会");
                        cyclicBarrier.await();
                        System.out.println(threadName + " 汇报工作");
                    } catch (InterruptedException | BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            };
            executorService.submit(task);
        }
    }
}
