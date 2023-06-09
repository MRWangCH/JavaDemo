package test.reflect;

public class MyReflectDemo1 {
    public static void main(String[] args) throws Exception {

        Class clazz1 = Class.forName("test.reflect.Student");

        Class clazz2 = Student.class;

        Student student = new Student();
        Class calzz3 = student.getClass();
    }
}
