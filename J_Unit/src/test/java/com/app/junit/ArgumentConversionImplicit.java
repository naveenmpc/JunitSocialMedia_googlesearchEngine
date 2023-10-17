package com.app.junit;

import java.time.temporal.ChronoUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ArgumentConversionImplicit {


	@ParameterizedTest
	@ValueSource(strings = "SECONDS") // input data source as String
	public void  testwithImplicitArgumentConversion(ChronoUnit chronoUnit) { // method expects a timeUnit not a string
		
		System.out.println(chronoUnit.name());
		Assertions.assertNotNull(chronoUnit.name());
		
	}

	
	
	
}
		

