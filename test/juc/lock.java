package juc;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class lock {
    @Test
    public void fair(){
        final FairLock fairLock = new FairLock(false);
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("当前线程名"+Thread.currentThread().getName() + "进入当前线程");
                fairLock.serviceMethod();
            }
        };
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0;i < 5; i++){
            executorService.execute(thread);
        }
        executorService.shutdown();
    }
}

