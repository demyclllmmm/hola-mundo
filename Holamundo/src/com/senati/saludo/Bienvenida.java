package com.senati.saludo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bienvenida
 */
public class Bienvenida extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Bienvenida() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = new PrintWriter(response.getOutputStream());
		out.println("<html>");
		out.println("<head><title>Hola mundo Servlet </title><link rel=\"stylesheet\" type=\"text/css\" href=\"css/css/bootstrap.min.css\">\r\n" + 
				"    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/css/personal.css\">\r\n" + 
				"\r\n" + 
				"    <script type=\"text/javascript\" src=\"js/js/bootstrap.min.js\"></script>\r\n" + 
				"\r\n" + 
				"    <script\r\n" + 
				"            src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n" + 
				"            integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n" + 
				"            crossorigin=\"anonymous\">\r\n" + 
				"        </script>\r\n" + 
				"\r\n" + 
				"        <script\r\n" + 
				"            src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\r\n" + 
				"            integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n" + 
				"            crossorigin=\"anonymous\">\r\n" + 
				"        </script>\r\n" + 
				"\r\n" + 
				"        <script\r\n" + 
				"            src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n" + 
				"            integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n" + 
				"            crossorigin=\"anonymous\">\r\n" + 
				"        </script></head>");
		out.println("<body style=\"background:url(img/paisaje.jpg);\">");
		out.println("<br><br>\r\n" + 
				"	<div class=\"container-fluid\">\r\n" + 
				"		<div class=\"row\">\r\n" + 
				"			<div class=\"col-md-6\" style=\"background-color: rgba(255, 192, 203,0.3);\">\r\n" + 
				"			");
		out.println("<h1><center>Hola mundo desde el Servidor web </center></h1>");
		out.println("<a href='index.html'><input type ='submit' value='volver'/></a>");
		out.println("	</div>\r\n" + 
				"  	</div>     \r\n" + 
				" </div>");
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
