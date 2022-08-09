package threadcoreknowledge.createthreads;

/**
 * 实现runnable接口创建线程
 */
public class RunnableStyle implements Runnable{

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }


    @Override
    public void run() {
        System.out.println("实现runnable接口创建线程");
    }
}
