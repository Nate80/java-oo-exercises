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

	private Robot findRobot(String name)
	{
		for(Robot r: robots)
		{
			if(r.getName() == name) 
			{
				return r;
			}
		}
		return null;
	}
	
	private void moveRobot() 
	{
		System.out.println("Pick your robot (name)");
		String robotName = s.next();
		System.out.println("How many minutes should the robot move?");	
		int robotTime = s.nextInt();
		findRobot(robotName).moveRobot(robotTime);
	}
	
	private double distanceBetweenRobots()
	{
		System.out.println("Select your robot (name)");
		String robotName = s.next();
		System.out.println("Select a second robot (name)");
		String robot2Name = s.next();
		return findRobot(robotName).robotDistance(findRobot(robot2Name));
	}
	
	private void rotateRobot()
	{
		System.out.println("Select your robot (name)");
		String robotName = s.next();
		findRobot(robotName).rotateRobot();
		
	}
	
	private void createRobot()
	{
		System.out.println("Please provide the robot's name.");
		String name = s.next();   
		
		System.out.println("Please enter the robot's x coordinate.");
		int x = s.nextInt();
		
		System.out.println("Please enter the robot's y coordinate.");
		int y = s.nextInt();
		
		System.out.println("Please enter the robot's speed.");
		int speed = s.nextInt();
		

		System.out.println("Please enter the robot's orientation (i.e. North, East, South, West).");
		String orientation = s.next();
		
		robots.add(new Robot(name, x, y, speed, orientation));
	}
	


}
