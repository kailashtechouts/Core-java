package org.java8.java;

interface Readable{  
    Message getRead(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  

public class ConstructorReference {

	public static void main(String[] args) {
		Readable hello = Message::new;  
        hello.getRead("Hello");  
     	}  
	}  



		        