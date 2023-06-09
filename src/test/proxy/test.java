package test.proxy;

public class test {
    public static void main(String[] args) {
        BigStar bigStar = new BigStar("鸡哥");
        Star proxy = ProxyUtil.createProxy(bigStar);

        String result = proxy.sing("只因你太美");
        System.out.println(result);
        proxy.dance();
    }
}
