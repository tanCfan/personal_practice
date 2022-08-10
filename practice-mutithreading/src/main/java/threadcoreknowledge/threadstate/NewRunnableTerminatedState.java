package threadcoreknowledge.threadstate;

public class NewRunnableTerminatedState implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new NewRunnableTerminatedState());
        System.out.println("state before start " + t.getState());

        t.start();
        Thread.sleep(10);
        System.out.println("state after start " + t.getState());

        Thread.sleep(1000);
        System.out.println("state after run completed " + t.getState());
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
