package threadcoreknowledge.startthreads;

/**
 * start才是正确的启动线程的方法，run是在当前线程中直接调用run方法
 */
public class StartAndRun {

    public static void main(String[] args) {
       Thread thread = new Thread () {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

        thread.run();

        thread.start();
    }
}
