package org.assign1.java;
/*A thread has "add" operation,other thread performs"avg" and other thread performs "display" operation which displays avg and
  add details after the two threads are compeletely performed.
 */

class Adding extends Thread{
	 static int c;
	
	public void run() {
		int a = 10;
		int b = 50;
		c = a + b;
	}
}
class Average extends Thread{
	static float z;
		public void run() {
			float x =36.4f;
			float y = 3.2f;
			z = (x + y)/2;
		}
}
class Display extends Thread{
	public void run() {
		System.out.println("Adding two number:"+Adding.c);
		System.out.println("Average of two numbers:"+Average.z);
	}
}
public class Task10 {

	public static void main(String[] args) {

		Adding ad = new Adding();
		Average avg = new Average();
		Display dis = new Display();
		ad.start();
		avg.start();
		dis.start();
	}

}
