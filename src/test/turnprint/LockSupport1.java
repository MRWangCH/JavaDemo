package test.turnprint;


/**
 * @author :
 * @date : 2022/12/2
 * 交替输出
 */
public class LockSupport1 {
    static Thread threadA = null;
    static Thread threadB = null;

    public static void main(String[] args) {
        String numberA = "123456";
        String characterB = "abcdef";

        threadA = new Thread(() -> {
            for (char c : numberA.toCharArray()) {
                System.out.print(c);
                //唤醒线程B
                java.util.concurrent.locks.LockSupport.unpark(threadB);
                //暂停当前线程
                java.util.concurrent.locks.LockSupport.park();

            }
        });
        threadB = new Thread(() -> {
            for (char c : characterB.toCharArray()) {
                //暂停当前线程
                java.util.concurrent.locks.LockSupport.park();
                System.out.print(c);
                //唤醒线程A
                java.util.concurrent.locks.LockSupport.unpark(threadA);
            }
        });
        threadA.start();
        threadB.start();

    }
}