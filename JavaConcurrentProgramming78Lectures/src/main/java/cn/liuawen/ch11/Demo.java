package cn.liuawen.ch11;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @description
 * @create 2023-02-21
 */
public class Demo {
    public static void main(String[] args) {
/*        new ThreadPoolExecutor(5, 10,
                5, TimeUnit.SECONDS, new LinkedBlockingQueue<>(),
                new ThreadPoolExecutor.DiscardOldestPolicy());*/
        new ThreadPoolExecutor(5, 10,
                5, TimeUnit.SECONDS, new LinkedBlockingQueue<>(),
                new ThreadPoolExecutor.DiscardOldestPolicy());
    }
}
