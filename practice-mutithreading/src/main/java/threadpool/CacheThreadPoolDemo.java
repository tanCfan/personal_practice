package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 核心线程数为0，最大线程数无限，有界任务队列，默认六十秒回收空闲线程。依旧有OOM风险。
 */
public class CacheThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            executorService.submit(new TaskDemo());
        }
    }

}
