package test.reflect2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Field;

public class test {
    public static void main(String[] args) throws Exception {
        Student s = new Student("小a", 23, '男', 170, "睡觉");
        Teacher t = new Teacher("大王", 10000);
        saveObject(t);
        //saveObject(s);


    }

    private static void saveObject(Object obj) throws Exception {
        Class clazz = obj.getClass();
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java_test\\a.txt"));
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(obj);
            bw.write(name + "=" + value);
            bw.newLine();
        }
        bw.close();
    }
}
