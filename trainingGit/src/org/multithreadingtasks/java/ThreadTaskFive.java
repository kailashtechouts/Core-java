package org.multithreadingtasks.java;

 class Five1 extends Thread{
		public void run() {
			System.out.println("thread is running");
			try {
				Thread.sleep(1000);
				int[] a = new int[5];
				a[5] = 4/0;
			}catch(InterruptedException e){    
	            throw new RuntimeException("Thread interrupted..."+e);  
			}catch(ArithmeticException ae) {
				System.out.println("It is arithmetic");
			}catch(ArrayIndexOutOfBoundsException aioobe) {
				System.out.println("it is Arrayindex exception");
			}finally {
				System.out.println("execute remaining problem");
			}
			System.out.println("normal flow");
				
			}
		}
 
	 class Five2 extends Thread{
			public void run() {
				System.out.println("thread is running");
				try {
					Thread.sleep(2000);
					int[] a = new int[5];
					a[5] = 4/0;
				}catch(InterruptedException e){    
		            throw new RuntimeException("Thread interrupted..."+e); 
				} catch(ArithmeticException ae) {
					System.out.println("It is arithmetic");
				}catch(ArrayIndexOutOfBoundsException aioobe) {
					System.out.println("it is Arrayindex exception");
				}
			}
	 }
			public class ThreadTaskFive{
		
				public static void main(String[] args) {
			
					Five1 ttf1 =  new Five1();
					Five2 ttf2 = new Five2();
					ttf1.start();
					ttf2.start();
					 try  
				        {    
				            ttf1.interrupt();  
				            ttf2.interrupt();
				        }catch(Exception e){System.out.println("Exception handled "+e);}    
				    }    
				}    

		
		
