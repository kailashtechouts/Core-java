package org.assign1.java;

class Threading extends Thread{
	public void run() {          //this is running state
		System.out.println("Thread full methods");
		try {
			Thread.sleep(500);			// this is blocked stage
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class Task13 {

	public static void main(String[] args) {
		Threading t=new Threading();			//this is new() state
		t.start();							//this is runnable state
	}

}

