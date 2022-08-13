package threadcoreknowledge.threadpool;

public class TaskDemo implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " working ");
    }
}

