package entities;

public class student {

	public String name;
	public double grade_1;
	public double grade_2;
	public double grade_3;

	public double finalGrade() {
		return grade_1 + grade_2 + grade_3; 
	}
	
	public double missing() {
		return 60.00 - finalGrade();
	}

	public void gradeTest() {
		if (finalGrade() >= 60.00) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", missing()) + " POINTS");
			}
	}
}
