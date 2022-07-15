
public class Enroll {

	private Student student;
	private Course course;
	private String entrollmentDate;
	public Enroll(Student student, Course course, String entrollmentDate) {
		super();
		this.student = student;
		this.course = course;
		this.entrollmentDate = entrollmentDate;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getEntrollmentDate() {
		return entrollmentDate;
	}
	public void setEntrollmentDate(String entrollmentDate) {
		this.entrollmentDate = entrollmentDate;
	}

}
