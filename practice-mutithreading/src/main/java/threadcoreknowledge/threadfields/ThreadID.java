package threadcoreknowledge.threadfields;

public class ThreadID {

    public static void main(String[] args) {
        Thread thread = new Thread();

        Thread main = Thread.currentThread();
        System.out.println(" main thread id : " + main.getId());
        System.out.println(" child thread id : " + thread.getId());

        System.out.println(" main is daemon thread " + main.isDaemon());
        System.out.println(" child thread is daemon thread " + thread.isDaemon());
    }
}
