package cn.liuawen.ch12;

import java.util.concurrent.RecursiveTask;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @description
 * @create 2023-02-21
 */
class Fibonacci extends RecursiveTask<Integer> {

    int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    @Override
    public Integer compute() {
        if (n <= 1) {
            return n;
        }
        Fibonacci f1 = new Fibonacci(n - 1);
        f1.fork();
        Fibonacci f2 = new Fibonacci(n - 2);
        f2.fork();
        return f1.join() + f2.join();
    }
}