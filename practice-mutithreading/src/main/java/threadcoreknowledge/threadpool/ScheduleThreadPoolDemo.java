package threadcoreknowledge.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 可以指定核心线程数，最大线程数无限，有界任务队列，默认0秒回收空闲线程。依旧有OOM风险。
 */
public class ScheduleThreadPoolDemo {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
        scheduledExecutorService.schedule(new TaskDemo(), 5, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(new TaskDemo(), 1, 3, TimeUnit.SECONDS);
    }
}
