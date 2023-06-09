package test.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		Person[] ps = new Person[]{
				new Person("bob",1),
				new Person("lucy",1),
				new Person("anny",1),
		};
		Arrays.sort(ps);
		System.out.println(Arrays.toString(ps));
 	}

	static class Person implements Comparable<Person> {
		String name;
		int age;

		public Person() {
		}

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}

		@Override
		public int compareTo(Person o) {
			return 0;
		}
	}
}
