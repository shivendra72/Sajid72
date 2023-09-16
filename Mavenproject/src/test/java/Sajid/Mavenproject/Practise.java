package Sajid.Mavenproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practise {
	

	@Test
	public void testMethod() {
		System.out.println("SUM");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);	
	}
	
	@Test
	public void testMethod1() {
		System.out.println("SUB");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b-a);	
	}
	
	@Test
	public void testMethod2() {
		System.out.println("DIV");
		int a = 10;
		int b = 20;
		Assert.assertEquals(2, b/a);	
	}

}



