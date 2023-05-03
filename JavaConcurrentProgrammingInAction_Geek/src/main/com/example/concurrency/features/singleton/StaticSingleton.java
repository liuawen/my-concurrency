package com.example.concurrency.features.singleton;

/**
 *
 */
public class StaticSingleton {

    private StaticSingleton(){
    }
    private static class StaticSingletonHolder{
        private static StaticSingleton singleton= new StaticSingleton();
    }
    public static StaticSingleton getInstance(){
        return StaticSingletonHolder.singleton;
    }
}
