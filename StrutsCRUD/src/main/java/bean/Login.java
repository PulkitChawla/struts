package bean;

import org.apache.struts.action.ActionForm;

public class Login extends ActionForm {
	
	private String email;
	private String pwd;
	
	public String getEmail() {
		return email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
