package threadcoreknowledge.threadexception;

public class CantCatchDirectly implements Runnable{


    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            Thread thread = new Thread(new CantCatchDirectly());
            thread.start();
        } catch (Exception e) {
            System.out.println(" catch child thread exception");
        }
    }
}
