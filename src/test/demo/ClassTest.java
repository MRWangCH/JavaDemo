package test.demo;

public class ClassTest {
    public static void main(String[] args) {
        String className = "123";
        Class cl = className.getClass();
        System.out.println(cl.getName());
    }
}
