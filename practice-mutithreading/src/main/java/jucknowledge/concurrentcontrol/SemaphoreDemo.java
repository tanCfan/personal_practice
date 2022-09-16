package jucknowledge.concurrentcontrol;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 20 ; i++) {
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    try {
                        String threadName = Thread.currentThread().getName();
                        System.out.println(threadName + " 尝试获取通行证");
                        semaphore.acquire(1);
                        System.out.println(threadName + " 获取到通行证，放行");
                        Thread.sleep(1000);
                        semaphore.release();
                        System.out.println(threadName + " 归还许可证");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            executorService.submit(task);
        }
    }
}
