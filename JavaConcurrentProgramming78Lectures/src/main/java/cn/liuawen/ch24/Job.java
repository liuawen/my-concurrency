package cn.liuawen.ch24;

/**
 * @description
 * @create 2023-03-19
 */
public class Job implements Runnable  {
    private PrintQueue printQueue;


    public Job(PrintQueue printQueue) {
        this.printQueue = printQueue;
    }


    @Override
    public void run() {
        System.out.printf("%s: Going to print a job\n", Thread.currentThread().getName());
        printQueue.printJob(new Object());
        System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
    }
}
