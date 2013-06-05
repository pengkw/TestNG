package com.pengkw.test;

import org.testng.annotations.*;

public class Example {

	@Test
	public void test() {
		System.out.println("Simple Test.");
	}

	@Test(groups = { "g1" })
	public void testGroup() {
		System.out.println("Group Test.");
	}
}
