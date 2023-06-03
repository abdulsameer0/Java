package Max;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/modi")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	                              PrintWriter out = response.getWriter();
				                 String uid = request.getParameter("ud");
				                 String pass = request.getParameter("pass");
				                 out.println("<a href=SS?ud="+uid+"&pass="+"raja"+pass+">NEXTTT</a>");
				                 
				              ServletContext cxt = getServletContext();
			                 cxt.setAttribute("a", uid);
									 
			                 
		                       
		                       
 }

	
	

}
