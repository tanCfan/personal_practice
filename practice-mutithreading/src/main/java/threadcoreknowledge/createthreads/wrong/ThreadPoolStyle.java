package threadcoreknowledge.createthreads.wrong;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 这种方式其实也是创建Thread类，只是加入了池化技术
 */
public class ThreadPoolStyle {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            executorService.submit(new Task());
        }
    }
}

class Task implements Runnable {


    @Override
    public void run() {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());
    }
}