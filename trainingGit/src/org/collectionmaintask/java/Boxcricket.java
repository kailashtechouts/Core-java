package org.collectionmaintask.java;

import java.util.HashMap;
import java.util.Map;

public class Boxcricket {

	HashMap<Integer, String> Filledslot2 = new HashMap<Integer, String>();
	HashMap<Integer, String> Timeslot2 = new HashMap<Integer, String>();{
	
	Timeslot2.put(1, "8:00 to 10:00");
	Timeslot2.put(2, "10:00 to 12:00");
	Timeslot2.put(3, "16:00 to 18:00");
	Timeslot2.put(4, "18:00 to 20:00");
	Timeslot2.put(5, "20:00 to 22:00");
	}
		public void go2() {
			for(Map.Entry m:Timeslot2.entrySet()) {
				System.out.println("the slot num is:"+m.getKey()+ " "+ "timing is:"+m.getValue());
			}
	}
			public void bc(int snum, String name) {
				boolean b = true;
				while(true)
				if(Timeslot2.containsKey(snum)) {
					System.out.println("slot is booked ");
					Filledslot2.put(snum, name);
					Timeslot2.remove(snum);
					return;
				}
				else {
					System.out.println("slot is not available");
				    return;
				}
			}
}
