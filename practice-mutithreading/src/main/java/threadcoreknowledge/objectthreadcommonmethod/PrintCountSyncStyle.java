package threadcoreknowledge.objectthreadcommonmethod;

public class PrintCountSyncStyle {

    private static Object lock = new Object();

    public static int count = 0;

    public static void main(String[] args) {


        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count <= 100) {
                    synchronized (lock) {
                        if ((count % 2) == 0) {
                            System.out.println(Thread.currentThread().getName() + " count : " + count);
                            count++;
                        }
                    }
                }
            }
        }, "偶数线程");


        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < 100) {
                    synchronized (lock) {
                        if ((count % 2) == 1) {
                            System.out.println(Thread.currentThread().getName() + " count : " + count);
                            count++;
                        }
                    }
                }
            }
        }, "奇数线程");

        threadA.start();
        threadB.start();
    }
}
