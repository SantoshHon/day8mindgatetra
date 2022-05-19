package com.mindgate.pojo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("monthDeatails")
@Scope("prototype")
public class MonthDeatails {
	private int monthId;
	private LocalDate monthStartYear;
	private LocalDate monthEndYear;
	@Autowired
	private FinancialYearDetails financialYearDetails;
	public MonthDeatails() {
		// TODO Auto-generated constructor stub
	}
	public MonthDeatails(int monthId, LocalDate monthStartYear, LocalDate monthEndYear,
			FinancialYearDetails financialYearDetails) {
		super();
		this.monthId = monthId;
		this.monthStartYear = monthStartYear;
		this.monthEndYear = monthEndYear;
		
		this.financialYearDetails = financialYearDetails;
	}
	public int getMonthId() {
		return monthId;
	}
	public void setMonthId(int monthId) {
		this.monthId = monthId;
	}
	public LocalDate getMonthStartYear() {
		return monthStartYear;
	}
	public void setMonthStartYear(LocalDate monthStartYear) {
		this.monthStartYear = monthStartYear;
	}
	public LocalDate getMonthEndYear() {
		return monthEndYear;
	}
	public void setMonthEndYear(LocalDate monthEndYear) {
		this.monthEndYear = monthEndYear;
	}
	public FinancialYearDetails getFinancialYearDetails() {
		return financialYearDetails;
	}
	public void setFinancialYearDetails(FinancialYearDetails financialYearDetails) {
		this.financialYearDetails = financialYearDetails;
	}
	@Override
	public String toString() {
		return "MonthDeatails [monthId=" + monthId + ", monthStartYear=" + monthStartYear + ", monthEndYear="
				+ monthEndYear + ", financialYearDetails=" + financialYearDetails + "]";
	}
	
}
