package juc;

import java.util.concurrent.locks.ReentrantLock;

public class FairLock {
    private ReentrantLock reentrantLock;
    public FairLock(boolean isFair){
        super();
        reentrantLock = new ReentrantLock(isFair);
    }
    public void serviceMethod(){
        try {
            reentrantLock.lock();
            System.out.println("当前线程名" + Thread.currentThread().getName() + "锁定");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }
}
