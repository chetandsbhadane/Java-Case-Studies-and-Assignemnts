
public class studentLogin {

	private String studName;
	private int studPass;
	public studentLogin(String studName, int studPass) {
		super();
		this.studName = studName;
		this.studPass = studPass;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getStudPass() {
		return studPass;
	}
	public void setStudPass(int studPass) {
		this.studPass = studPass;
	}

}
