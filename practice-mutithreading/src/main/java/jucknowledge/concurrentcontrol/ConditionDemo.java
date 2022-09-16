package jucknowledge.concurrentcontrol;

import java.util.PriorityQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionDemo {

    private PriorityQueue<Integer> queue = new PriorityQueue<>(10);

    private Lock lock = new ReentrantLock();

    private Condition notEmpty = lock.newCondition();

    private Condition notFull = lock.newCondition();

    public static void main(String[] args) {
        ConditionDemo conditionDemo = new ConditionDemo();

        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    conditionDemo.lock.lock();
                    while (conditionDemo.queue.size() == 0) {
                        try {
                            System.out.println("队列为空，消费者等待数据");
                            conditionDemo.notEmpty.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    conditionDemo.queue.poll();
                    System.out.println("队列不为空，消费者消费数据，队列剩余任务数：" + conditionDemo.queue.size() );
                    conditionDemo.notFull.signalAll();
                    conditionDemo.lock.unlock();
                }
            }
        };


        Runnable producer = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    conditionDemo.lock.lock();
                    while (conditionDemo.queue.size() == 10) {
                        try {
                            System.out.println("队列已经满了，生产者停止生产数据");
                            conditionDemo.notFull.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    conditionDemo.queue.add(1);
                    System.out.println("队列没满，生产者生产数据，队列任务数 ： " + conditionDemo.queue.size());
                    conditionDemo.notEmpty.signalAll();
                    conditionDemo.lock.unlock();
                }
            }
        };

        Thread t1 = new Thread(consumer);
        Thread t2 = new Thread(producer);

        t1.start();
        t2.start();
    }
}

