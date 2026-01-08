package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Practice_2 {
	@Test
	public void method1() {
		System.out.println("Practice_2 ---> method1()");
	}
	
	@Test
	public void method2() {
		System.out.println("Practice_2 ---> method2()");
		assertTrue(false);
	}
}
