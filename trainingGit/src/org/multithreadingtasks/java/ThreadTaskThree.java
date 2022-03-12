package org.multithreadingtasks.java;

/*Display all the properties of running threads. Create 3 threads and rename thread1 to "yourName" and make this thread a daemon thread.
  Get the updated thread details.
 */

class Threadingsone extends Thread {
	public void run() {
		/*if(Thread.currentThread().isDaemon()){//checking for daemon thread  
			   System.out.println("This is daemon thread ");  
			  }  
			  else{  
			  System.out.println("This is not daemon thread");  
			 }   */
				try {
					Thread.sleep(1000);
					}catch(Exception e) {
						System.out.println(e);
					}
				}

}
class Threadingstwo extends Thread{
	public void run() {
		System.out.println("This is thread 2");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
class Threadingsthree extends Thread{
	public void run() {
		System.out.println("Thread is thread 3");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}

public class ThreadTaskThree{
	
	public static void main(String[] args) {
		Threadingsone tdo1 = new Threadingsone();
		Threadingstwo tdt2 = new Threadingstwo();
		Threadingsthree tdt3 = new Threadingsthree();
		tdo1.setName("kailash");
		System.out.println("This thread name is:"+tdo1.getName());
		tdo1.setDaemon(false);
		System.out.println("this is daemon thread:"+tdo1.isDaemon());
		tdo1.start();
		tdt2.start();
		tdt3.start();
	}
}



