package threadcoreknowledge.problems;

public class DeadLockDemo {

    private static Object lock1 = new Object();

    private static Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " get lock1 ");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (lock2) {
                        System.out.println(Thread.currentThread().getName() + "get lock2");
                    }
                }
            }
        }, "A");

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " get lock2 ");
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (lock1) {
                        System.out.println(Thread.currentThread().getName() + " get lock1");
                    }
                }
            }
        }, "B");

        threadA.start();

        Thread.sleep(20);

        threadB.start();
    }
}
