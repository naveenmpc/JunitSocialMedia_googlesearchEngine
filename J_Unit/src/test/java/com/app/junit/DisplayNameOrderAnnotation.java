package com.app.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DisplayNameOrderAnnotation {

	


// @TestMethodOrder(MethodOrderer.Random.class)  // run test randomly and not in any order

	
	// @Test(priority='1',name="displaynameofTest")

	@Order(4)
	@DisplayName("4. SignIn button")
	@Test
	public void method1()
	{
		System.out.println("testing sign In button");
	}
	
	@Order(1)
	@DisplayName("1. Username field")
	@Test
	public void method2()
	{
		System.out.println("Testing username");
	}
	@Order(2)
	@DisplayName("2. Password field")
	@Test
	public void method3()
	{
		System.out.println("Testing password field");
	}
	@Order(3)
	@DisplayName("3. forget password field")
	@Test
	public void method4()
	{
		System.out.println("testing forget password field");
	}
	
	
	
	
}

