package threadcoreknowledge.createthreads;

/**
 * 继承Thread类方式创建线程
 */
public class ThreadStyle extends Thread {

    public static void main(String[] args) {
        Thread thread = new ThreadStyle();
        thread.start();
    }

    @Override
    public void run() {

        System.out.println("继承Thread类方式创建线程");
    }
}
