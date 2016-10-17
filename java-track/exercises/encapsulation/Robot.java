package encapsulation;


public class Robot {
	
	//Fields:
	
	private String name;
	private int x;
	private int y;
	private int speed;
	private String orientation;

				
				
	//Behaviors:
	public Robot(String name, int x, int y, int speed, String orientation)
	{
		this.name = name;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.orientation = orientation;
	}

	public String getName()
	{
		return this.name;
	}
	
	
	public int getX()
	{
		return this.x;
	}

	public int getY()
	{
		return this.y;
	}
	
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public String getOrientation()
	{
		return this.orientation;
	}	

	
    // Rotate Robot (90 degrees)	
	public void rotateRobot()
	{
		if (this.orientation ==  "North") 
			{
					this.orientation = "East";
			}
		else if (this.orientation == "East")
			{
					this.orientation = "South";
			}
		else if (this.orientation == "South")
			{
					this.orientation = "West";
			}
		else // this.orientation == "West"
			{
					this.orientation = "North";
			}
	}


    // Move Robot
	public void moveRobot(int time)
	{
		int distance = this.speed * time;
		if (this.orientation == "North")
			{
					this.y = this.y + distance;
			}
		else if (this.orientation == "South")
			{
				this.y = this.y - distance;
			}
		else if (this.orientation == "West")
			{
				this.x = this.x - distance;
			}
		else //this.orientation == "East"
			{
				this.x = this.x + distance;
			}	
	}

	// Determine distance between it and other robot object
	public double robotDistance(Robot other)
	{
		int xDiff = other.getX() - this.x;
		int yDiff = other.getY() - this.y;
		return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));	
	}
		
	
    // To String (to return info about the Robot object as a string)
	public String toString()
	{
		return "Name: " + this.name + " Position: x = " + this.x + " y = " + this.y + " Orientation: " + this.orientation + " Speed: " + this.speed;
	}
	

	public static void main(String[] args) {
		Robot myRobot = new Robot("ART", 2, 2, 10, "West");
		Robot yourRobot = new Robot("LUD", 1, 1, 5, "West");
		System.out.println(myRobot.robotDistance(yourRobot));
		System.out.println(myRobot.toString());
		System.out.println(yourRobot.toString());
		myRobot.moveRobot(10);
		System.out.println(myRobot.toString());
		myRobot.rotateRobot();
		System.out.println(myRobot.toString());
		

	}

}