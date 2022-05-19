package com.mindgate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mindgate.pojo.FinancialYearDetails;
import com.mindgate.pojo.MonthDeatails;

@Configuration
@ComponentScan("com.mindgate.pojo")
public class ApplicationConfig {
//	@Bean
//	public FinancialYearDetails financialYearDetails() {
//		return new FinancialYearDetails();
//
//	}
//
//	@Bean
//	public MonthDeatails monthDeatails() {
//		FinancialYearDetails financialYearDetails = new FinancialYearDetails();
//		MonthDeatails monthDeatails = new MonthDeatails();
//		monthDeatails.setFinancialYearDetails(financialYearDetails);
//		return monthDeatails;

	//}
}
