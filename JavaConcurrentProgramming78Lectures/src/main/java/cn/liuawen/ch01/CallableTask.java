package cn.liuawen.ch01;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-24
 */
public class CallableTask implements Callable<Integer> {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        //提交任务，并用 Future提交返回结果
        Future<Integer> future = service.submit(new CallableTask());
        System.out.println(future.get());
    }
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }
}
