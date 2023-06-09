package test.demo;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        int result = 6;
        while (true) {
            System.out.println("请猜入一个数：");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("您猜的数是：" + num + "，答案不对");
            if (num == result){
                System.out.println("猜对了！");
                break;
            }
        }
    }
}
