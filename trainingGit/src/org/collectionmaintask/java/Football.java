package org.collectionmaintask.java;

import java.util.HashMap;
import java.util.Map;

public class Football {

	HashMap<Integer, String> Filledslot1 = new HashMap<Integer, String>();
	HashMap<Integer, String> Timeslot1 = new HashMap<Integer, String>();{
	
	Timeslot1.put(1, "8:00 to 8:30");
	Timeslot1.put(2, "8:30 to 9:00");
	Timeslot1.put(3, "9:00 to 9:30");
	Timeslot1.put(4, "9:30 to 10:00");
	Timeslot1.put(5, "10:00 to 10:30");
	Timeslot1.put(6, "10:30 to 11:00");
	Timeslot1.put(7, "11:00 to 11:30");
	Timeslot1.put(8, "11:30 to 12:00");
	Timeslot1.put(9, "12:00 to 12:30");
	Timeslot1.put(10,"14:00 to 14:30");
	Timeslot1.put(11, "14:30 to 15:00");
	Timeslot1.put(12, "15:00 to 15:30");
	Timeslot1.put(13, "15:30 to 16:00");
	Timeslot1.put(14, "16:00 to 16:30");
	Timeslot1.put(15, "16:30 to 17:00");
	Timeslot1.put(16, "17:00 to 17:30");
	Timeslot1.put(17, "17:30 to 18:00");
	Timeslot1.put(18, "18:00 to 18:30");
	Timeslot1.put(19, "18:30 to 19:00");
	Timeslot1.put(20,"19:00 to 19:30");
	}
		public void go1() {
			for(Map.Entry m:Timeslot1.entrySet()) {
				System.out.println("the slot num is:"+m.getKey()+ " "+ "timing is:"+m.getValue());
			}
	}
			public void ft(int snum, String name) {
				boolean b = true;
				while(true)
				if(Timeslot1.containsKey(snum)) {
					System.out.println("slot is booked ");
					Filledslot1.put(snum, name);
					Timeslot1.remove(snum);
					return;
				}
				else {
					System.out.println("slot is not available");
					return;
				}
			}
}
