package org.collectionmaintask.java;

import java.util.Scanner;

public class SportsComplex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Badminton play = new Badminton();
		Football play1 = new Football();
		Boxcricket play2 = new Boxcricket();
		boolean b1 = true;
		while(b1) {
			System.out.println("Enter name:");
			String name = sc.next();
			System.out.println("Enter the sports you want to play" +"1 for basketball" + "Enter 2 for football" + "Enter 3 for boxCricket");
			int i = sc.nextInt();
			if(i == 1) {
			play.go();
			System.out.println("Enter your slot number");
			int snum = sc.nextInt();
			play.bd(snum, name);
			continue;
			}
			else {
				System.out.println("slots are full");
				}
				if(i == 2) {
				play1.go1();
				System.out.println("Enter your slot number");
				int snum = sc.nextInt();
				play1.ft(snum,name);
				continue;
				}
				else  {
					System.out.println("slot are");
					}
					if(i == 3) {
					play2.go2();
					System.out.println("Enter your slot number");
					int snum = sc.nextInt();
					play2.bc(snum, name);
					continue;
					}
					else {
						System.out.println("slots are");
						}
					}
		}
}

