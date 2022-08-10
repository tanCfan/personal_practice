package threadcoreknowledge.stopthreads;

/**
 * 工作线程存在休眠的情况时停止线程
 */
public class RightWayStopThreadWithSleep implements Runnable {

    @Override
    public void run() {
        int currentCount = 0;
        int stopCount = 300;
        try {
            while (!Thread.currentThread().isInterrupted() && currentCount <= stopCount) {
                if (currentCount % 10 == 0) {
                    System.out.println(currentCount + " 是10的倍数");
                    Thread.sleep(1000);
                }
                currentCount++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RightWayStopThreadWithSleep());
        thread.start();
        Thread.sleep(500);
        thread.interrupt();
    }
}
