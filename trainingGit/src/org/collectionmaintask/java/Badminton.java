package org.collectionmaintask.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Badminton {

	HashMap<Integer, String> Filledslot = new HashMap<Integer, String>();
	HashMap<Integer, String> Timeslot = new HashMap<Integer, String>();{
	
	Timeslot.put(1, "8:00 to 9:00");
	Timeslot.put(2, "9:00 to 10:00");
	Timeslot.put(3, "10:00 to 11:00");
	Timeslot.put(4, "11:00 to 12:00");
	Timeslot.put(5, "13:00 to 14:00");
	Timeslot.put(6, "14:00 to 15:00");
	Timeslot.put(7, "15:00 to 16:00");
	Timeslot.put(8, "16:00 to 17:00");
	Timeslot.put(9, "17:00 to 18:00");
	Timeslot.put(10,"18:00 to 19:00");
	}
		public void go() {
			for(Map.Entry m:Timeslot.entrySet()) {
				System.out.println("the slot num is:"+m.getKey()+ " "+ "timing is:"+m.getValue());
			}
	}
			public void bd(int snum,String name) {
				boolean b = true;
				while(true) {
				if(Timeslot.containsKey(snum)) {
					System.out.println("slot is booked ");
					Filledslot.put(snum, name);
					Timeslot.remove(snum);
					return;
					}
				else {
					System.out.println("slot is not available");
					return;
					}
				}
			}
}

	
	