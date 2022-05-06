package action;

import com.opensymphony.xwork2.ActionSupport;

import controller.RegController;
import dao.Dao;

public class MyAction extends ActionSupport {

	private String name,email,pwd,cpwd,phone;
	private String msg="";
	
	RegController controller=null;
	int i=0;
	
	public String execute() throws Exception {
		 controller=new RegController();
	
	try {
		i=controller.register(name, email, email, cpwd, phone);
		if(i>0) {
			msg="registration successfull";
		}
		else {
			msg="registration not successfull";
		}
	}
	catch(Exception e) {
		
	}
	return "register";
}
}
