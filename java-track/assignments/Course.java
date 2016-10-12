
public class Course {
	private String name;
	private int credits;
	private int remainingSeats;
	private Student[] roster;
	
	public Course(String name, int credits, int seats) {
		this.name = name;
		this.credits = credits;
		this.remainingSeats = seats;
		this.roster = new Student[seats];
	}
	
	//getters and setters
	
	public String getName() {
		return this.name;
	}
	
	public int getCredits() {
		return this.credits;
	}
	
	public int getRemainingSeats() {
		return this.remainingSeats;
		
	}
	
	public Student[] getRoster() {
		return this.roster;
	}
	
	public boolean studentEnrolled(Student student) {
		for(Student enrolled : this.roster) {
			if(enrolled != null) {
				if(enrolled.getName() == student.getName()) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean addStudent(Student student) {
		if(this.remainingSeats == 0) {
			return false;
			} else {
				for(Integer i = 0; i < this.roster.length; i = i + 1) {
					if(this.roster[i] == null) {
						this.roster[i] = student;
						this.remainingSeats = this.remainingSeats - 1;
						return true;
					}
				}
			}
		return false;
	}
	
	public void generateRoster() {
		System.out.println("Roster for " + this.name + ":");
		for(Student student : this.roster) {
			if(student == null) {
				System.out.println(" Empty");
			} else {
				System.out.println(" " + student.getName());
			}
		}
	}
	
	public double averageGPA() {
		double sum = 0.0;
		int numOfStudents = 0;
		for(int i = 0; i < roster.length; i++) {
			if(roster[i] != null) {
				sum += roster[i].getGPA();
				numOfStudents++;
			}
		}
		
		return sum / numOfStudents;
		
	}
	
	public String toString() {
		return("Course Number: " + this.name + "; Course Credits: " + this.credits);
	}
}
