package serwlety;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
		//response.setContentType("text/html");
		String adresKlienta = request.getRemoteAddr();
		System.out.println("ping " + adresKlienta);
		
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("Ala ma kota.");
		out.println("Ola ma psa który jest ą ę.");
		out.println("Twój adres to : " + adresKlienta);
	}

}
