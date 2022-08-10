package threadcoreknowledge.objectthreadcommonmethod;

import java.util.LinkedList;

public class ProducerConsumerModel {

    public static void main(String[] args) {
        EventStorage eventStorage = new EventStorage();
        Thread threadA = new Thread(new Producer(eventStorage));
        Thread threadB = new Thread(new Consumer(eventStorage));
        threadA.start();
        threadB.start();
    }
}

class Producer implements Runnable {

    private EventStorage eventStorage;

    public Producer (EventStorage eventStorage) {
        this.eventStorage = eventStorage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            eventStorage.put("产品啊");
        }
    }
}

class Consumer implements Runnable {

    private EventStorage eventStorage;

    public Consumer (EventStorage eventStorage) {
        this.eventStorage = eventStorage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            eventStorage.take();
        }
    }
}

class EventStorage {

    private int maxSize = 10;

    private LinkedList<String> list = new LinkedList<>();

    public synchronized void put(String element) {
        while (list.size() == maxSize) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(element);
        System.out.println(Thread.currentThread().getName() + "生成产品咯" + " 仓库目前有 " + list.size() + "个产品");
        notify();
    }

    public synchronized void take () {
        while (list.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        list.poll();
        System.out.println(Thread.currentThread().getName() + "消费产品咯" + " 仓库还剩下 " + list.size() + " 个产品");
        notify();
    }
}
