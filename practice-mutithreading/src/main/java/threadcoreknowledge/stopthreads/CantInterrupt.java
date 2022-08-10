package threadcoreknowledge.stopthreads;

/**
 * 线程响应中断后，中断标记被清除
 */
public class CantInterrupt implements Runnable {

    @Override
    public void run() {
        int currentCount = 0;
        int stopCount = 300;

        while (!Thread.currentThread().isInterrupted() && currentCount <= stopCount) {
            if (currentCount % 10 == 0) {
                System.out.println(currentCount + " 是10的倍数");
            }
            currentCount++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new CantInterrupt());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
