package cn.liuawen.ch05;

import java.util.LinkedList;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @description
 * @create 2023-02-19
 */
public class MyBlockingQueue {
    private int maxSize;
    private LinkedList<Object> storage;

    public MyBlockingQueue(int size) {
        this.maxSize = size;
        storage = new LinkedList<>();
    }

    public synchronized void put() throws InterruptedException {
        while (storage.size() == maxSize) {
            wait();
        }
        storage.add(new Object());
        notifyAll();
    }

    public synchronized void take() throws InterruptedException {
        while (storage.size() == 0) {
            wait();
        }
        System.out.println(storage.remove());
        notifyAll();
    }
}
