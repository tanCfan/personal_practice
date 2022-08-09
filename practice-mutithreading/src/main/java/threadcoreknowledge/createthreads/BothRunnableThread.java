package threadcoreknowledge.createthreads;

/**
 * 同时使用Runnable和Thread方式
 *  Runnable实现的工作内容将会被覆盖，因为Thread的run方法被重写了，不再调用Runnable的run方法
 */
public class BothRunnableThread {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("实现runnable接口创建线程");
            }
        }) {
            @Override
            public void run() {
                System.out.println("继承Thread类方式创建线程");
            }
        };

        thread.start();
    }
}
