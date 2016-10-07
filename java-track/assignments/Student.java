import java.text.DecimalFormat;

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
	
	public double submitGrade(double grade, int courseCredits) {
		double gpatotal = this.gpa + (grade * courseCredits);
		this.credits = this.credits + courseCredits;
		this.gpa = (gpatotal / this.credits);
		this.gpa = (double)Math.round(this.gpa * 1000)/1000d;
		
		return this.gpa;
	}
	
	/*public double computeTuition() {
		
		double numSemesters = this.credits/15;
		double totTuition = numSemesters * 20000;
		return totTuition;
				
	}*/
	
	public static void main(String[] args) {
		Student s = new Student("D", "S", 1);
		
		System.out.println(s.submitGrade(3.5555, 3));
		
		/*for (int i = 0; i < 14; i++) {
			s.submitGrade(0, 1);
			System.out.println(s.credits+" credits:"+"test code= "+(i+1) * 1333.33 +" My code= "+ s.computeTuition());
		}
		s.submitGrade(0, 1);
		System.out.println(s.credits+" credits:"+"test code= "+20000.0+" My code= "+ s.computeTuition());

		for (int i = 0; i < 14; i++) {
		s.submitGrade(0, 1);
		System.out.println(s.credits+" credits:"+"test code= "+(1333.33 * (i+1) + 20000.0)+" My code= "+ s.computeTuition());
		}*/
		}
}




