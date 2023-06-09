package test.threadlocal;

import java.util.UUID;

public class ThreadLocalDemo {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        Runnable task = () -> {
            threadLocal.set(Thread.currentThread().getName() + "的数据");
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());
        };

        Thread t1 = new Thread(task, "线程A");
        Thread t2 = new Thread(task, "线程B");

        t1.start();
        t2.start();

    }
}
