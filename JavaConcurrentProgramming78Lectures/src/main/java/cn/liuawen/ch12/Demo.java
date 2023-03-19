package cn.liuawen.ch12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @description
 * @create 2023-02-21
 */
public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Fibonacci f = new Fibonacci(3);
//        System.out.println(f.compute());
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        for (int i = 0; i < 10; i++) {
            ForkJoinTask task = forkJoinPool.submit(new Fibonacci(i));
            System.out.println(task.get());
        }
    }
}
