package encapsulation;

public class Robot {
	//Fields:
	
	private String name;
	private int positionX, positionY;
	private int speed;
	private char orientation;
		
	//Behaviors:
	
	public Robot(String name, int positionX, int positionY, int speed, char orientation)
	{
		this.name = name;
		this.positionX = positionX;
		this.positionY = positionY;
		this.speed = speed;
		this.orientation = orientation;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getPosition()
	{
		return this.positionX, this.positionY;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public char getOrientation()
	{
		
	}
	
	public void moveRobot(int newPosX, int newPosY)
	{
		
	}
	//Create a Robot
	//movement (position, orientation, speed)
	//rotate (orientation change)
	//Robot position relative to other Robot
	//Robot toString name, position, speed, orientation
	
	//create main method to test Robot's functionality
	
	

}
