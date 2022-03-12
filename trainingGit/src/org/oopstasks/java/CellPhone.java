package org.oopstasks.java;

	class Contacts {
		String name;
		long phonenum1, phonenum2;
		public void ph1(String name) {
			System.out.println("Kailash");
		}
	}
	class Contact1 extends Contacts{
		public void ph1(long phonenum1) {
			this.phonenum1 = phonenum1;
			System.out.println("It is phone number 1:"+phonenum1);
		}
	}

	class Contact2 extends Contacts{
		public void ph1(long phonenum2) {
			this.phonenum2 = phonenum2;
			System.out.println("It is phone number 2:" +phonenum2);
		}
	}
class CellPhone {

	public static void main(String[] args) {
		
		Contacts cs = new Contacts();
		Contact1 cs1 = new Contact1();
		Contact2 cs2 = new Contact2();
		cs.ph1("Kailash");
		cs1.ph1(7093092427l);
		cs2.ph1(7207796690l);
	}

}
