

public class Student {
	private String firstName;
	private String lastName;
	private int studentId;
	private int credits;
	private double gpa;
	
	public Student(String firstName, String lastName, int studentId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.credits = 0;
		this.gpa = 0.000;
		
		
	}
	
	public Student(Student father, Student mother) {
		this.firstName = father.getName();
		this.lastName = mother.getName();
		this.studentId = father.getStudentID() + mother.getStudentID();
		this.gpa = (father.getGPA() + mother.getGPA())/2;
		this.credits = Math.max(father.getCredits(), mother.getCredits());
	}
	
	public String getName() {
		String name = this.firstName + " " + this.lastName;
		return name;
		
	}
	
	public int getStudentID() {
		return this.studentId;
	}
	
	public int getCredits() {
		return this.credits;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	
	public String getClassStanding() {
		if(this.credits < 30) {
			return "Freshman";
			
		} else if (this.credits >=30 && this.credits < 60) {
			return "Sophomore";
					
		}  else if (this.credits >= 60 && this.credits <90) {
			return "Junior";
			
		} else {
			return "Senior";
		}
		
	}
	
	public void submitGrade(double grade, int courseCredits) {
		double qualityScore = grade * courseCredits;
		double prevQualityScore = this.gpa * this.credits;
		this.credits = this.credits + courseCredits;
		this.gpa = (qualityScore + prevQualityScore)/this.credits;
		this.gpa = (double)(Math.round(this.gpa*1000))/1000;
				
		
	}
	
	public double computeTuition() {
		
		double costPerCredit = 20000.00 / 15;
		return (costPerCredit * this.credits);
				
	}
	
	public Student createLegacy(Student father, Student mother) {
		Student legacy = new Student(father, mother);
		return legacy;
	}
	
	public String toString() {
		return ("StudentName: " + firstName + " " + lastName + "StudentID: " + studentId);
	}
	
	public static void main(String[] args) {
	Student s = new Student("D", "S", 1);
	System.out.println(s.getName());
	System.out.println(s.getGPA());
	
	//System.out.println(s.submitGrade(3.5555, 3));
	System.out.println(s.getGPA());
	//System.out.println(s.createLegacy("Terry Howard","Mary Howard"));
	
	for (int i = 0; i < 14; i++) {
		s.submitGrade(0, 1);
		System.out.println(s.credits+" credits:"+"test code= "+(i+1) * 1333.33 +" My code= "+ s.computeTuition());
	}
	s.submitGrade(0, 1);
	System.out.println(s.credits+" credits:"+"test code= "+20000.0+" My code= "+ s.computeTuition());

	for (int i = 0; i < 14; i++) {
	s.submitGrade(0, 1);
	System.out.println(s.credits+" credits:"+"test code= "+(1333.33 * (i+1) + 20000.0)+" My code= "+ s.computeTuition());
	}
	}
	
		
}




