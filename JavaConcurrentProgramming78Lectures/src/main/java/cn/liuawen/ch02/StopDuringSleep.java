package cn.liuawen.ch02;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-25
 */
public class StopDuringSleep {

    public static void main(String[] args) throws InterruptedException {
        java.lang.Runnable runnable = () -> {
            int num = 0;
            try {
                while (!Thread.currentThread().isInterrupted() && num <= 1000) {
                    System.out.println(num);
                    num++;
                    Thread.sleep(1000000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(5);
        thread.interrupt();
    }
}