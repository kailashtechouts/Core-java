package org.switchcase.java;

public class Break {

	public static void main(String[] args) {

		for(int i = 1; i<=10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		for(int a = 1; a<=4; a++) {
			for(int b = 1; b<=4; b++) {
				if(a==2 && b==2) {
				break;	
				}
				System.out.println(a+ " "+b);
			}
		}

	}

}
