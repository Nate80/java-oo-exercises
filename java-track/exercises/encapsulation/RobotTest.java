package encapsulation;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest {

	@Test
	public void testRotateRobot() {
		Robot m = new Robot("M", 4, 4, 5, "North");
		assertTrue(m.getOrientation() == "North");
		m.rotateRobot();
		assertTrue(m.getOrientation() == "East");
		}
	
	@Test
	public void testMoveRobot() {
		Robot m = new Robot("M", 4, 4, 5, "North");
		assertTrue(m.getOrientation() == "North");
		m.moveRobot(5);
		assertTrue(m.getY() == 29);
	}
	
	@Test
	public void testRobotDistance() {
		Robot m = new Robot("M", 4, 4, 5, "North");
		
	}
	
	
	
		
	}


