package threadcoreknowledge.objectthreadcommonmethod;

public class SleepDontReleaseMonitor implements Runnable {

    private static Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " get monitor and run");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " wake up and run");
        }
    }

    public static void main(String[] args) {
        SleepDontReleaseMonitor sleepDontReleaseMonitor = new SleepDontReleaseMonitor();
        Thread threadA = new Thread(sleepDontReleaseMonitor);
        Thread threadB = new Thread(sleepDontReleaseMonitor);

        threadA.start();
        threadB.start();
    }
}
