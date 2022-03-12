package org.java8tasks4.java;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import javax.swing.text.DateFormatter;

public class TimeFormat {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		LocalDate yesterday = ld.minusDays(1);
		LocalDate today = ld.plusDays(2);
		System.out.println("ld:" +ld);
		System.out.println("yesterday:" +yesterday);
		System.out.println("today:" +today);
		LocalDate ld1 = LocalDate.of(2015, 10, 12);
		System.out.println(ld1.isLeapYear());
		 String ldStr = ld.format(DateTimeFormatter.ISO_DATE);  
		 System.out.println("date format:" +ldStr);
		 
		 System.out.println("----------------------------------------------");

		LocalTime lt = LocalTime.now();
		LocalTime time1 = lt.minusHours(2);
		LocalTime time2 = time1.plusMinutes(20);
		System.out.println("lt:" +lt);
		System.out.println("time1:" +time1);
		System.out.println("time2:" +time2);
		String ltStr = ld.format(DateTimeFormatter.ISO_DATE);  
		System.out.println("date format:" +ltStr);
		
		System.out.println("--------------------------------------------------");
		
		
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime dtime1 = ldt.minusDays(100);
		LocalDateTime dtime2 = dtime1.plusMinutes(200);
		System.out.println("ldt:" +ldt);
		System.out.println("dtime1:" +dtime1);
		System.out.println("dtime2:" +dtime2);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
		  String formatDateTime = dtime2.format(format);
		  System.out.println("date format:" +formatDateTime);
			

	}
}
		