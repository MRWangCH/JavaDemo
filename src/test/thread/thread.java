package test.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class thread {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        List<Future> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            //Callable c = new MyCallable(i +"" );

        }
    }
}
