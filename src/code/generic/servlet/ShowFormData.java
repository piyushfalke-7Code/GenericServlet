package code.generic.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class ShowFormData
 */
@WebServlet("/ShowFormData")
public class ShowFormData extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public ShowFormData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String reqname = request.getParameter("name");
		out.print("Request Data:"+reqname);
		out.close();
	}

}
