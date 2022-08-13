package threadcoreknowledge.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 只有一个工作线程，无界任务队列
 */
public class SingleThreadPoolExecutorDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 1000; i++) {
            executorService.submit(new TaskDemo());
        }
    }
}
