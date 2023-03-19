package cn.liuawen.ch21;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @description
 * @create 2023-02-26
 */
public class Demo {
    public synchronized void method(){

    }
    public void method2() {
//        this.intrinsicLock.lock();
        try{
//            method body
        }
        finally {
//            this.intrinsicLock.unlock();
        }
    }
}
