package cn.liuawen.ch39;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description
 * @create 2023-05-02
 */
public class Demo {
    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger();
        System.out.println(i.get());
        int ii = i.getAndSet(100);
        AtomicInteger iii = new AtomicInteger(100);
        System.out.println(ii);
        System.out.println(i.get());
        iii.getAndAdd(3);
        System.out.println(iii.getAndIncrement());
        System.out.println(iii.getAndIncrement());
    }
}
