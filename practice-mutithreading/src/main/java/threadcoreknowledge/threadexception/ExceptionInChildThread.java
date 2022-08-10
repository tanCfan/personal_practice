package threadcoreknowledge.threadexception;

public class ExceptionInChildThread implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ExceptionInChildThread());
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
