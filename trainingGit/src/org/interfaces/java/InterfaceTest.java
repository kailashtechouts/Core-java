package org.interfaces.java;

	interface Artist {
		void draw();
	}
	class Rhombus implements Artist {
		public void draw() { 
			System.out.println("he is drwaing rhobus");
		}
	}
	class Quadrilateral implements Artist {
		public void draw() {
			System.out.println("He can draw");
		}
	}

public class InterfaceTest {

	public static void main(String[] args) {
		
		Artist at = new Quadrilateral();
		at.draw();

	}

}
