package ogloszenia.soap;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import ogloszenia.baza.DostepDoBazy;
import ogloszenia.exn.BladBazyDanych;
import ogloszenia.exn.NieznanyRekord;
import ogloszenia.model.Samochodowe;

@WebService
public class SerwisOgloszeniowy {
    @WebResult(name="ogloszenie")
    public List<Samochodowe> odczytajWszystkieOgloszenia() throws BladBazyDanych {
   	 try(DostepDoBazy db = new DostepDoBazy()) {
   		 return db.ogloszeniaDAO().odczytajWszystkie();
   	 }
    }

    @WebResult(name="ogloszenie")
    public Samochodowe odczytajWgId(
   		 @WebParam(name="id") int idOgloszenia) throws BladBazyDanych, NieznanyRekord {
   	 try(DostepDoBazy db = new DostepDoBazy()) {
   		 return db.ogloszeniaDAO().odczytajWgId(idOgloszenia);
   	 }
    }

}



