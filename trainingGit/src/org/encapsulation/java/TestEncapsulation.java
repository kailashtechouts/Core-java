package org.encapsulation.java;


	class Company {
		private long id_no;
		private String name, email;
		private float salary;
		public long getid_no() {
			return id_no;
		}
		public void setId_no(long id_no) {
			this.id_no = id_no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
	}
public class TestEncapsulation {

	public static void main(String[] args) {
		Company com = new Company();
		com.setId_no(18380008220L);
		com.setName("kailash");
		com.setEmail("kailash@gmai.com");
		com.setSalary(450000f);
		System.out.println(com.getid_no()+ " "+com.getName()+ " "+com.getEmail()+ " "+com.getSalary());
	}
}
