package threadcoreknowledge.threadstate;

public class BlockedWaitingTimeWaitingState implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        BlockedWaitingTimeWaitingState runnable = new BlockedWaitingTimeWaitingState();

        Thread t1 = new Thread(runnable);
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.start();

        Thread.sleep(10);

        System.out.println("state of t1 " + t1.getState());
        System.out.println("state of t2 " + t2.getState());

        Thread.sleep(1100);
        System.out.println("state of t1 " + t1.getState());
    }

    @Override
    public void run() {
        try {
            doSomething();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void doSomething () throws InterruptedException {
        Thread.sleep(1000);
        wait();
    }
}
