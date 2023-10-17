package com.app.junit;

import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTest2 {
	@TestFactory
	public Stream<DynamicTest> dynamicTestsforPalindrome()  // here DynamicTest is class generating testcase at runtime
	{
		return Stream.of("pop","mom","dad","madam").map(inputText ->
		
		DynamicTest.dynamicTest(inputText,
			
				() -> Assertions.assertTrue(Myutils.isPalindrome(inputText)))	
				
				
				);
		
		
	}

}
