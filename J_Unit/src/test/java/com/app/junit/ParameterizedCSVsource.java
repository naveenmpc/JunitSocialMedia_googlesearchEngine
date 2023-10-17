package com.app.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedCSVsource {
	// CSV => storing data in form of row and colums-> like an excel
	
	
		@ParameterizedTest(name = "CSV source {arguments}")
		@CsvSource({
				"Audi ,  15",  // row and column
				"BMW ,   34",
				"Volvo , 48",
				"Merc ,  80"		
		})
		
		public void datafrom_CSVsource(String car, String quantity)
		{
			System.out.println(car+" : "+quantity);
		}

	}

