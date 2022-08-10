package threadcoreknowledge.threadexception;

public class MyUncaughtExceptionHandler implements Runnable, Thread.UncaughtExceptionHandler{

    private String name;

    public MyUncaughtExceptionHandler(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        MyUncaughtExceptionHandler myHandler = new MyUncaughtExceptionHandler("我的捕获器");
        Thread.setDefaultUncaughtExceptionHandler(myHandler);
        Thread thread = new Thread(myHandler, "A");
        thread.start();
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(name + " 捕获了线程：" + t.getName() + " 抛出的异常：" + e.toString());
    }

    @Override
    public void run() {
        throw new RuntimeException();
    }
}
