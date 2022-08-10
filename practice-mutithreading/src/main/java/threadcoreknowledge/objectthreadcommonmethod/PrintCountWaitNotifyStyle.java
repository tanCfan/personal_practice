package threadcoreknowledge.objectthreadcommonmethod;

public class PrintCountWaitNotifyStyle implements Runnable {

    private static int count = 0;

    private static Object lock = new Object();

    @Override
    public void run() {
        while (count <= 100) {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " count : " + count++);
                lock.notify();
                if (count < 100) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        PrintCountWaitNotifyStyle printCountWaitNotifyStyle = new PrintCountWaitNotifyStyle();
        Thread threadA = new Thread(printCountWaitNotifyStyle, "ThreadA");
        Thread threadB = new Thread(printCountWaitNotifyStyle, "ThreadB");

        threadA.start();
        threadB.start();
    }
}
