package serwlety;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Rozmowa
 */
@WebServlet("/Rozmowa")
public class Rozmowa extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String imie = request.getParameter("imie");
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String operacja = request.getParameter("operacja");
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
	   	 out.println("<head>");
	   	 out.println("<title>Rozmowa</title>");
	   	 out.println("</head>");
	   	 out.println("<body>");
	   	 out.println("<h1>Rozmowa z serlwetem</h1>");
	   	 out.println("<form>");
	   	 out.println("<label for='imie'>Jak masz na imię?</label>");
	   	 out.println("<input name='imie' type='text'>");
	   	 out.println("<button>Wyślij</button>");
	   	 out.println("<br>");
	   	 

	   	 if(imie != null) {
	   		 out.println("<div class='wynik'>");
	   		 out.println("Witaj "+ imie);
	   		 out.println("</div>");
	   	 }

	   	 
	   	 out.println("</form>");
	   	 out.println("</body>");
	   	 out.println("</html>");
		
	   	 
	   	 




	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		doGet(request, response);
	}

}
