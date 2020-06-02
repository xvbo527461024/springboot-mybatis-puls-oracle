//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.sm.com.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class ThreadPool {
    static ExecutorService fixedThreadPool;
    static final Semaphore semp = new Semaphore(1);
    static final int MAX_THREAD_NUM = 10;

    public ThreadPool() {
    }

    public static ExecutorService getInstance() {
        try {
            semp.acquire();
            if (fixedThreadPool == null) {
                fixedThreadPool = Executors.newFixedThreadPool(10);
            }

            semp.release();
        } catch (InterruptedException var1) {
            if (fixedThreadPool == null) {
                fixedThreadPool = Executors.newFixedThreadPool(10);
            }
        }

        return fixedThreadPool;
    }
}
