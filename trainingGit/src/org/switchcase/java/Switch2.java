package org.switchcase.java;

public class Switch2 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		for(int x = 1; x<=10; x++) {
			for(int y = 1; y<=10; y++) {
				if(x==4 && y==5) {
					continue;
				}
				System.out.println(x+ " "+y);
			}
		}

	}

}
