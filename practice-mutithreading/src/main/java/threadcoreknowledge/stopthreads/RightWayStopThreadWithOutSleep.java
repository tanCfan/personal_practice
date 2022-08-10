package threadcoreknowledge.stopthreads;

/**
 * 在线程没有休眠的时候正确停止线程
 */
public class RightWayStopThreadWithOutSleep implements Runnable {

    @Override
    public void run() {
        int currentCount = 0;
        int stopCount = Integer.MAX_VALUE / 2;
        while (!Thread.currentThread().isInterrupted() && currentCount <= stopCount) {
            if (currentCount % 10000 == 0) {
                System.out.println(currentCount + " 是10000的倍数");
            }
            currentCount++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RightWayStopThreadWithOutSleep());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
