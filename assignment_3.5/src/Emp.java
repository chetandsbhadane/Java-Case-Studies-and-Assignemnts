
public class Emp {
	private int empId;
	private String empNameString;
	private String designation;
	private double basic;
	private double hra;
	public Emp(int empId, String empNameString, String designation, double basic) {
		super();
		this.empId = empId;
		this.empNameString = empNameString;
		this.designation = designation;
		this.basic = basic;
//		this.hra = hra;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpNameString() {
		return empNameString;
	}
	public void setEmpNameString(String empNameString) {
		this.empNameString = empNameString;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	
	
}
