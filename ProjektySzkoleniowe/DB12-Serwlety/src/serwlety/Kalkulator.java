package serwlety;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Kalkulator")
public class Kalkulator extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	 response.setContentType("text/html");
   	 response.setCharacterEncoding("utf-8");
   	 PrintWriter out = response.getWriter();
   	 
   	 String strX = request.getParameter("x");
  	 String strY = request.getParameter("y");
  	 String op = request.getParameter("operacja");
  	 

  	 
  	 
   	 out.println("<!DOCTYPE html>");
   	 out.println("<html>");
   	 out.println("<head>");
   	 out.println("<style>");
   	 out.println(".error {color:red}");
   	 out.println("</style>");
   	 out.println("<title>Kalkulator serwletowy</title>");
   	 out.println("</head>");
   	 out.println("<body>");
   	 out.println("<h1>Kalkulator serwletowy</h1>");
   	 
   	 out.println("<p>Podaj działanie:</p>");
   	 out.println("<form>");
   	 out.println("<input name='x' type='number'>");
   	 out.println("<select name='operacja'>");
   	 out.println("<option value='+'>+</option>");
   	 out.println("<option value='-'>-</option>");
   	 out.println("<option value='*'>*</option>");
   	 out.println("<option value='/'>/</option>");
   	 out.println("</select>");
   	 out.println("<input name='y' type='number'>");
   	 out.println("<button>Oblicz</button>");
   	 out.println("</form>");
   	 
   	out.println("<br><br><center><strong> Wynik: " + kalk(strX, strY, op) + "</strong></center>");
   	
   	 out.println("</body>");
   	 out.println("</html>");
    }
    
    protected int kalk(String strX, String strY, String op) {
	 	   	 int zero = 0;
	  	 if (strX != null & strY != null && op != null) {
	  		 int x = Integer.parseInt(strX);
	  		 int y = Integer.parseInt(strY);
	  	 
	    		switch (op) {
	    		    case "+":
	    		    {
	    		    	int result = x + y;
	    		    	return result;
	    		       // out.println("<br><br><center><strong> Wynik: " + result + "</strong></center>");

	    		    }
	    		    case "-":
	    		    {
	    		    	int result = x - y;
	    		    	return result;

	    		        //out.println("<br><br><center><strong> Wynik: " + result + "</strong></center>");

	    		    }
	    		    case "*":
	    		    {
	    		    	int result = x * y;
	    		    	return result;

	    		       // out.println("<br><br><center><strong> Wynik: " + result + "</strong></center>");
	    		    }
	    		    case "/":
	    		    {
	    		    	int result = x / y;
	    		    	return result;

	    		       // out.println("<br><br><center><strong> Wynik: " + result + "</strong></center>");

	    		    }   
	    		}		
		 }
	  	return zero;
  	 }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	 doGet(request, response);
    }

    private static boolean isNotEmpty(String s) {
   	 return s != null && !s.isEmpty();
    }
}



