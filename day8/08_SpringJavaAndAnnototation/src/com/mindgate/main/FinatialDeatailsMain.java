package com.mindgate.main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.FinancialYearDetails;
import com.mindgate.pojo.MonthDeatails;

public class FinatialDeatailsMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		FinancialYearDetails financialYearDetails=applicationContext.getBean("financialYearDetails",FinancialYearDetails.class);
		financialYearDetails.setYearId(2012);
		financialYearDetails.setYearStartDate(LocalDate.of(2012, 04, 01));
		financialYearDetails.setYearEndDate(LocalDate.of(2013, 03, 31));
		System.out.println(financialYearDetails);
		
		MonthDeatails deatails=applicationContext.getBean("monthDeatails",MonthDeatails.class);
		deatails.setMonthId(11);
		deatails.setMonthStartYear(LocalDate.of(2012, 11, 01));
		deatails.setMonthEndYear(LocalDate.of(2012, 11, 30));
		deatails.setFinancialYearDetails(financialYearDetails);
		System.out.println(deatails);

	}

}
