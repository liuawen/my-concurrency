package cn.liuawen.ch39;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @description
 * @create 2023-05-02
 */
public class AtomicArrayDemo {
    public static void main(String[] args) {
        AtomicIntegerArray integerArray = new AtomicIntegerArray(10);
        System.out.println(integerArray.getAndIncrement(0));
        System.out.println(integerArray.getAndIncrement(5));
    }
}
