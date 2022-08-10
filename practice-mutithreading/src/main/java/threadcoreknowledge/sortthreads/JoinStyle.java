package threadcoreknowledge.sortthreads;

/**
 * 使用join方式将线程排序执行
 */
public class JoinStyle {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1 执行");
        });

        Thread t2 = new Thread(() -> {
            try {
                t1.join();
                Thread.sleep(80);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2 执行");
        });

        Thread t3 = new Thread(() -> {
            try {
                t2.join();
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t3 执行");
        });

        t3.start();
        t2.start();
        t1.start();
    }
}
