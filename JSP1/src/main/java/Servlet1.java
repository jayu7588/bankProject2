import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{

	private static final long serialVersionUID = 1L;
	 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		// name id sal
		String name = req.getParameter("name");
		int id = Integer.parseInt(req.getParameter("id"));
		int salary = Integer.parseInt(req.getParameter("salary"));
		
		resp.setContentType("text/html");
		PrintWriter writter = resp.getWriter();
		writter.println("id "+ id +" name"+ name+ " salary "+salary);
	}

}

//1. Declaration tag => <%!  %> => This tag is used to declare the variables or methods of a java.
//2. Scriptlet tag   => <%  %>  => This tag is used to write java logic for dynamic response.
//3. Expression tag  => <%=  %> => This tag is used to print results on web browser.
//4. Directive tag   => <%@  %> => This tag is used to import external resources in a JSP file.