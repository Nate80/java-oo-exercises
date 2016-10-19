package encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu {
	
	private ArrayList<Robot> robots;
	private Scanner s;
	
	public static void main(String[] args) {
		int x = 0;
		RobotMenu rm = new RobotMenu();
		do {
			x = rm.startMenu();
			rm.processInput(x);			
		} while (x != 6);
	}
	
	public RobotMenu() {
		s = new Scanner(System.in);
		robots = new ArrayList<Robot>();
	}
	
	public int startMenu() {
		
		System.out.println("Welcome to the Robot Constructor!");
		System.out.println("1. Create a Robot.");
		System.out.println("2. Display the list of available robots.");
		System.out.println("3. Move a robot.");
		System.out.println("4. Rotate a robot.");
		System.out.println("5. Compute the distance between two robots.");
		System.out.println("6. Exit");
		int selection = s.nextInt();
		while(selection < 0 || selection > 6) {
			System.out.println("Invalid selection, please try again!");
			selection = s.nextInt();
		}
		return selection;
	}
	
	public void processInput(int selection) {
		if(selection == 1) {
			createRobot();
		} else if (selection == 2) {
			displayRobots();
		} else if (selection == 3) {
			moveRobot();
		} else if (selection == 4) {
			rotateRobot();
		} else if (selection == 5) {
			distanceBetweenRobots();
		}
	}
	
	public void displayRobots() {
		for(int i = 0; i < robots.size(); i++)
		{
			System.out.println((i+1) + ".)" + robots.get(i)); 
		}
		
	}

	
}
