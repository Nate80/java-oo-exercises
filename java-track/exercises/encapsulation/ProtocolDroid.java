package encapsulation;

import java.util.ArrayList;

public class ProtocolDroid extends Robot {

	private boolean isHostile;
	
	public ProtocolDroid(String name, int x, int y, int speed, String orientation, boolean isHostile) {
		super(name, x, y, speed, orientation);
		this.isHostile = isHostile;
		}
	
	public String determineSubjectMood() {
		String reaction = "";
		if(this.isHostile = true) {
			reaction = "Please remain calm.";
		} else {
			reaction = "It is a pleasure to meet you.";
		}
		
		return reaction;
	}
	
	public static void main(String args[]) {
		Robot a = new ProtocolDroid("C3PO", 4, 3, 5, "North", true);
		
		System.out.println(a.toString());
	}
}
