package test;

import org.testng.annotations.Test;

public class Practice_4 {
	@Test
	public void method_1() {
		System.out.println("Practice_4 ---> method_1()");
	}
	
	@Test(groups= {"execute"})
	public void method_2() {
		System.out.println("Practice_4 ---> method_2()");
	}
	
	@Test(groups= {"execute"})
	public void method_3() {
		System.out.println("Practice_4 ---> method_3()");
	}
}
