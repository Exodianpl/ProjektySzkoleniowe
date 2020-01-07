package ogloszenia.serwlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ogloszenia.baza.DostepDoBazy;
import ogloszenia.baza.OgloszeniaDAO;
import ogloszenia.exn.BladBazyDanych;
import ogloszenia.model.Samochodowe;

@WebServlet("/P1_WszystkieOgloszeniaTxt")
public class P1_WszystkieOgloszeniaTxt extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	 response.setContentType("text/plain");
   	 response.setCharacterEncoding("utf-8");
   	 PrintWriter out = response.getWriter();
   	 
   	 try(DostepDoBazy db = new DostepDoBazy()) {
   		 OgloszeniaDAO dao = db.ogloszeniaDAO();
   		 List<Samochodowe> ogloszenia = dao.odczytajWszystkie();
   		 
   		 out.println("Odczytałem " + ogloszenia.size() + " ogłoszeń:");
   		 for (Samochodowe ogl : ogloszenia) {
   			 out.println(ogl);
   		 }
   	 } catch (BladBazyDanych e) {
   		 e.printStackTrace(out);
   	 }
    }

}



