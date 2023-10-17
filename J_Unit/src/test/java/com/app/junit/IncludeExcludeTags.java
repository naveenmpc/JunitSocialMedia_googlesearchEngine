package com.app.junit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;

@IncludeTags({"devlop"})  // execute those methods that have tag name as devlopment
@ExcludeTags({"prod"})// execute those methods that do not have tag name as prod
public class IncludeExcludeTags{

	
	@Test
	@Tag("devlop")
	public void devtest2()
	{
		System.out.println("test Case development2");
	}
	
	@Test
	@Tag("devlop")
	public void devTest4()
	{
		System.out.println("test Case development 4");
	}
	
	
	@Test
	@Tag("Qa")
	public void qatest1()
	{
		System.out.println("test Case QA 1");
	}
	
	
@Test
@Tag("Qa")
	public void qatest3()
	{
		System.out.println("test Case QA 3");
	}


@Test
@Tag("prod")
public void prodTest1()
{
	System.out.println("test Case Production 1");
}


@Test
@Tag("prod")
public void prodtest2()
{
	System.out.println("test Case Production 2");
}
	
	
	
	
}
