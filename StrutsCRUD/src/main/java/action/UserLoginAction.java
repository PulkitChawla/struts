package action;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import bean.Login;
import dao.Dao;

public class UserLoginAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession ses = request.getSession(true);
 
        Login login = (Login)form;
        String email = login.getEmail();
        String pwd = login.getPwd();
        RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
        rd.include(request, response);  
        PrintWriter out=response.getWriter();
        if(email.isEmpty())
	    {
		 out.print("<center><h4 style=color:red>Please fill your email !..</h4></center>");  
	    }
        else if(pwd.isEmpty())
		{
			 out.print("<center><h4 style=color:red>Please fill your password !..</h4></center>");  
		}
	    
        Dao dao = new Dao();
        dao.login(login);
       
        ses.setAttribute("email", email);
        ses.setAttribute("pwd", pwd);
       
        if (email.equals("") || pwd.equals("")) {
            return mapping.findForward("LoginFailure");
        }
        return mapping.findForward("LoginSuccess");
 
    }
}
/* 
 					Control Flow of Struts Framework

1.There is only one controller component in the Struts framework, 
   and that is the org.jakarta.struts.action.ActionServlet. 

2.The ActionServlet represents the Controller in the MVC design pattern.  
  Addtionally, the ActionServlet implements both the Front Controller and the Singleton pattern.  
  A quick and dirty description of the Front Controller pattern is that it allows for a centralized 
  access point for presentation-tier request handling.  

3. The Singleton pattern provides a single instance of an object and is a good sample of a pattern 
   within a pattern.  There is one instance of this Servlet class per web application that receives 
   and processes all requests that change the state of a user's interaction with the application.  

4. The ActionServlet instance selects and invokes an Action class to perform the requested 
   business logic.  The Action classes don't produce the next page of the user interface directly;  
   instead, they use the RequestDispatcher.forward() facility of the Servlet API to pass control to 
   an appropriate JSP in order to produce the next page of the user interface.  
   
5. The RequestDispatcher object provides methods for controlling application flow without having to 
   actually send data back to the client.  The forward() method is a server-side transfer mechanism 
   used to transfer control to another JSP.  
   
6.  The version of ActionServlet that is distributed with the framework implements the logic flow 
	for each incoming client HTTP request.  First the action is identified from the incoming request 
	URI that was submitted by a client browser.This URI is parsed, and the substring is then used 
	to select the appropriate action to invoke.
	
7.	The substring is used to map to the Java class name of the corresponding Action class.  
	If this is the first request for a particular Action class, the class will be instantiated and 
	will then be cached for future use by the Servlet.  
	
	If an ActionFormBean corresponding to a view page has been specified in the configuration 
	of the action, then the properties of that form Bean will be populated, and optionally 
	the validate() method will be called on the ActionFormBean.  

8.  The validate() method is used, you guessed it, to validate properties of a form.  
	It can be used for verifying user input or to correct formatting of form fields that appear 
	on a JSP.  

9. There is a method in the Action class that plays an important role, and that is the execute()method,
   formerly known in the Struts 1.0.x releases as the perform() method.  
   We'll talk about this method in detail when we cover Actions, but for now, the execute() method of 
   this Action class is called from the ActionServlet. 
   A reference to the action mapping that was used by the ActionServlet is passed as one of the 
   parameters. This mapping provides access to the ActionServlet and ServletContext, as well as to 
   other information contained in the mapping that can be used by the action itself.
   The request and response that were passed to the controller by the servlet container are also 
   passed into the execute() method.These parameters ensure that the action has all the information 
   it needs to complete its task.  
	
   When creating your controller Servlet, if you don't need to customize anything in your servlet, 
   you can simple specify in the web.xml file an instance of org.apache.struts.action.ActionServlet.
   It is also possible to override some or all of this functionality by subclassing this servlet 
   and implementing your own version of the processing.
   
   The ActionServlet is configured by parameters configured in the web.xml file.
 */

/*
 
 
 
 
 
 */


