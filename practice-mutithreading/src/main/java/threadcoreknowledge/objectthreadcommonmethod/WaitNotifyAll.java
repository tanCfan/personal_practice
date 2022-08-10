package threadcoreknowledge.objectthreadcommonmethod;

public class WaitNotifyAll implements Runnable {

    public static Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            String currentThreadName = Thread.currentThread().getName();
            System.out.println( currentThreadName + " is running ");
            try {
                lock.wait();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(currentThreadName + " is running after wait ");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new WaitNotifyAll(), "A");
        Thread threadB = new Thread(new WaitNotifyAll(), "B");
        threadA.start();
        threadB.start();

        Thread.sleep(200);

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    String currentThreadName = Thread.currentThread().getName();
                    System.out.println(currentThreadName + " is running ");
                    lock.notifyAll();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(currentThreadName + " is running after notify all");
                }
            }
        }, "C");
        threadC.start();
    };
}
