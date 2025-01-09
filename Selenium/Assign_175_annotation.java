package TestngAssignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assign_175_annotation {
	@BeforeMethod
	public void bs() {
		System.out.println("printing before method");
	}

	@Test
	public void test1() {
		System.out.println("printing test1");
	}

	@Test
	public void test2() {
		System.out.println("printing test2");
	}

	@Test
	public void test3() {
		System.out.println("printing test3");
	}

	@AfterMethod

	public void as() {
		System.out.println("printing aftermethod");
	}
}
