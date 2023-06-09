package test.demo;

public class test0209 {
    public static void main(String[] args) {
        //主方法中对函数进行测试。
        String a = new String("abcd");
        System.out.println("字符串反转前：" + a);
        test0209 stringTest01 = new test0209();
        //调用下面写的字符串反转函数，并打印输出。
        System.out.println("字符串反转后：" + stringTest01.reversesre(a));

    }

    //写的实现字符串实现反转的方法。需要传递一个参数。
    public String reversesre(String str) {
        //讲字符串转化为char类型数组
        char[] chars = str.toCharArray();
//        定义char数组第0个索引值赋值给star
        int star = 0;
//        定义char数组最后一个索引值赋值给end
        int end = chars.length - 1;
//        当char数组前半部分元素的索引小于后半部分时候，进行元素的交换
        while (star < end) {
            //使用异或交换元素 底层实际是二进制码之间的异或运算
            chars[star] ^= chars[end];
            chars[end] ^= chars[star];
            chars[star] ^= chars[end];
            star++;
            end--;
        }

        return new String(chars);
    }

}

