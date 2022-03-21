package org.assign6.java;

import java.util.Scanner;

public class CheckDate {

		public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Checker c=new Checker();
		System.out.println("Enter date to check: ");
		String s=sc.nextLine();
		c.AfterOrNot(s);
		c.earlierOrNot(s);
		c.converter();
		}

		}

