
public class Student {

	private int studId;
	private String studName;
	private String moNo;
	private String dateOfB;
	private int pass;

	public Student(int studId, String studName, String moNo, String dateOfB, int pass) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.moNo = moNo;
		this.dateOfB = dateOfB;
		this.pass = pass;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getMoNo() {
		return moNo;
	}

	public void setMoNo(String moNo) {
		this.moNo = moNo;
	}

	public String getDateOfB() {
		return dateOfB;
	}

	public void setDateOfB(String dateOfB) {
		this.dateOfB = dateOfB;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}


	Student() {

	}

}
