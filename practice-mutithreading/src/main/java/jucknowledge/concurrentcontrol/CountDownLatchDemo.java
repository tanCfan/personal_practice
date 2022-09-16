package jucknowledge.concurrentcontrol;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("开始工作");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("结束工作");
                countDownLatch.countDown();
            }
        };

        for (int i = 0; i < 5; i++) {
            executorService.submit(task);
        }

        System.out.println("等所有人完成工作先");
        countDownLatch.await();
        System.out.println("所有人都完成工作啦，大家收工");
    }
}
