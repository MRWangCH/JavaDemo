package test.demo;


/**
 * 匿名内部类*
 * 不用实例化接口就可以重写接口中的方法并调用*
 */
public class demo1 {
	public static void main(String[] args) {
		Test test = new Test(){
			@Override
			public void eat() {
				System.out.println("实现了eat方法");
			}
			@Override
			public void drink() {
				System.out.println("实现了drink方法");
			}
		};
		test.eat();
		test.drink();
	}

	interface Test{
		void eat();
		void drink();
	}
}
