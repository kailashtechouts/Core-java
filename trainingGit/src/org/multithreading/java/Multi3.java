package org.multithreading.java;

class Ram extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Jai Shri Ram");
			try{
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}
class Krishna extends Thread {
	public void run() {
		for( int i = 0; i < 5; i++) {
			System.out.println("Jai Shri Krishna");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}
public class Multi3 {
	
	public static void main(String args[]) {

	Ram r = new Ram();
	Krishna k = new Krishna();
	r.start();
	try {
		Thread.sleep(10);
	}catch(Exception e) {}
	k.start();
	}
}
