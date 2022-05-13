
package action;

import dao.Dao;
import bean.Register;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.util.regex.Pattern;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.Action;
public class UserRegisterAction extends Action {
//	
//	
//	  private static final Pattern PASSWORD_PATTERN =" abcd"; 
////	Pattern.compile("^" +
////	  "(?=.*[@#$%^&+=])" +  at least 1 special character "(?=\\S+$)" +  no
////	  white spaces ".{4,}" +  at least 4 characters "$");
//	 
	String result;
	public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
		Register register=(Register)form;
		Dao dao=new Dao();
		String name=register.getName();
		String email=register.getEmail();
		String pwd=register.getPwd();
		String cpwd=register.getCpwd();
		String phone=register.getPhone();
		String coun=register.getCountry();
		String gen=register.getGender();
//		
		 RequestDispatcher rd=request.getRequestDispatcher("reg.jsp");  
	        rd.include(request, response);  
		PrintWriter out=response.getWriter();
//		
//		if(name.isEmpty() || phone.isEmpty() || email.isEmpty() || pwd.isEmpty() )
//	      {
//			 out.print("<center><h4 style=color:red>Please fill all fields !..</h4></center>");  
//				
//	      }
//		else
//			
//			if(name.isEmpty())
//			{
//			 out.print("<h4 style=color:red>Please fill your name !..</h4>");  
//		    }
//		    else if(email.isEmpty())
//		    {
//			 out.print("<h4 style=color:red>Please fill your email !..</h4>");  
//		    }
//		    else if(pwd.isEmpty())
//			{
//				 out.print("<h4 style=color:red>Please fill your password !..</h4>");  
//			}
//		    else if(phone.isEmpty())
//		    {
//			 out.print("<h4 style=color:red>Please fill your mobilenumber !..</h4>");  
//		    }
//		
//			
//			  else if(!pwd.matches(String.valueOf(PASSWORD_PATTERN))) { out.
//			  print("<center><h4 style=color:red>Please fill strong password !..</h4></center>"
//			  ); }
//			 
//	        else if(!email.matches(email))
//			 {
//	    	  out.print("<h4 style=color:red>Please fill valid email !..</h4>");  
//				 
//		     }
//	        else if(coun.isEmpty())
//	        {
//	    	  out.print("<h4 style=color:red>Please select your country !..</h4>");  
//		    }
//	        else if(gen.isEmpty())
//	        {
//	    	  out.print("<h4 style=color:red>Please select gender !..</h4>");  
//		    }
//	        else
//	       {
	  		try {
	  			result =dao.register(register);
	  		} catch (Exception e) {
	  			e.printStackTrace();
	  		}
	  		if(result!=null)
			{
	  			return mapping.findForward("RegisterSuccess");
			}
			else
			{
			out.print("<script>alert('Sorry! Some Error');</script>");
			return mapping.findForward("RegisterFailure");
			}
		}
	
	}		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
//	  //	}
//
////	
////	}
////		return super.execute(mapping, form, request, response);
////	}        
//		
////HttpSession ses = request.getSession(true);
//// 
//        Register registerForm = (Register) form;
//        String name = registerForm.getName();
//        String email = registerForm.getEmail();
//        String pwd = registerForm.getPwd();
//        String cpwd = registerForm.getCpwd();
//        int phone = registerForm.getPhone();
////        
////        Dao dao = new Dao();
////        dao.register(registerForm);
////        ses.setAttribute("name", name);
////        ses.setAttribute("email", email);
////        ses.setAttribute("pwd", pwd);
////        ses.setAttribute("cpwd", cpwd);
////        ses.setAttribute("phone", phone);
//        if (name.equals("") || email.equals("") || pwd.equals("") || cpwd.equals("") || phone==0) {
//            return mapping.findForward("failure");
//        }
	  		//return mapping.findForward("success");
