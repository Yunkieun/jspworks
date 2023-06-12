package member;

// Member 빈, VO
public class Member{
	
	private String userid;
	private String passwd;
	private String uname;
	
	// setter, getter
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getUserid() {
		return userid;
	}
	
	public String setPasswd(String passwd) {
		return passwd;
	}	
	
	public String getPasswd() {
		return passwd;
	}
	
	public String getUname() {
		return uname;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}
}