package shiping.book;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;     

	@javax.ejb.EJB
	private HelloBean myBean;
	
	protected void doGet(HttpServletRequest request, 
			             HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		response.getWriter().append("<html>");
		response.getWriter().append("<body>");
		response.getWriter().append("<br>");
		response.getWriter().append("<h1>Hello from Servlet!</h1>");
		response.getWriter().append("<br>");
		response.getWriter().append("<h1>" + myBean.from() + "</h1>");		
		response.getWriter().append("</body>");
		response.getWriter().append("</html>");
	}

}
