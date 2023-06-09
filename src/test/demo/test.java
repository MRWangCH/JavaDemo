package test.demo;

import java.lang.Thread;
public class test {
    public static void main(String[] args) {
        Thread t = new Thread( () ->  {
            System.out.println("启动了一个线程");
        });
        t.start();
    }
}
//class MyThread extends Thread {
//    @Override
//    public void run() {
//        System.out.println("start new thread!");
//    }
//}



