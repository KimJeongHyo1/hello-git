package com.sh.app;

import com.sh.app.animal.Cat;
import com.sh.app.animal.Chicken;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Hamster;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		System.out.println("HELLO GIT");
		
//		new Foo().test();
		System.out.println("동물기능 시작!");
		new Dog().bark();
		new Cat().jump();
		new Hamster().yum();
		new Chicken().run();
		
	}
		public void test() {
			System.out.println("Main#test");
		}

}
