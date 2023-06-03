package Max;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MulticastSocket;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SS")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   PrintWriter out = response.getWriter();
		   
		   
	     String ud = request.getParameter("ud");
         String pass = request.getParameter("pass");
    
         
         ServletContext cxt = getServletContext();

         String  t =(String) cxt.getAttribute("rani");
         out.print("Second servlet "+ud+" "+pass);
         System.out.println("ServletContext "+t);
	}

	
	

}
