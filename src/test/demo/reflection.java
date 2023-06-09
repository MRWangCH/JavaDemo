package test.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Constructor对象封装了构造方法的所有信息；
 *
 * 通过Class实例的方法可以获取Constructor实例：getConstructor()，getConstructors()，getDeclaredConstructor()，getDeclaredConstructors()；
 *
 * 通过Constructor实例可以创建一个实例对象：newInstance(Object... parameters)； 通过设置setAccessible(true)来访问非public构造方法。
 */
public class reflection {
	public static void main(String[] args) throws Exception {
		// 获取构造方法Integer(int):
		Constructor<Integer> cons1 = Integer.class.getConstructor(int.class);
		// 调用构造方法:
		Integer n1 = cons1.newInstance(123);
		System.out.println(n1);

		// 获取构造方法Integer(String)
		Constructor cons2 = Integer.class.getConstructor(String.class);
		Integer n2 = (Integer) cons2.newInstance("456");
		System.out.println(n2);

		Constructor<String> cons3 = String.class.getConstructor(String.class);
		String n3 = cons3.newInstance("hello world");
		System.out.println(n3);




		Class i = Integer.class;
		Class n = i.getSuperclass();
		System.out.println(n);//Integer的父类是Number
		Class o = n.getSuperclass();
		System.out.println(o);//Number的父类是Object
		System.out.println(o.getSuperclass());
		
		
		
		Class s = Integer.class;
		Class[] interfaces = s.getInterfaces();
		for (Class is:interfaces ) {
			System.out.println(is);
		}

		Class s1 = String.class;
		Class[] interfaces1 = s1.getInterfaces();
		for (Class is:interfaces1 ) {
			System.out.println(is);
		}




		InvocationHandler handler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println(method);
				if (method.getName().equals("morning")) {
					System.out.println("Good morning, " + args[0]);
				}
				return null;
			}
		};
		Hello hello = (Hello) Proxy.newProxyInstance(
				Hello.class.getClassLoader(), // 传入ClassLoader
				new Class[] { Hello.class }, // 传入要实现的接口
				handler); // 传入处理调用方法的InvocationHandler
		hello.morning("Bob");
	}

	interface Hello {
		void morning(String name);
	}
}