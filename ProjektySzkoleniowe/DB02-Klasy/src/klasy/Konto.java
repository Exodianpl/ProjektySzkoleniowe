package klasy;

public class Konto {

	int numer;
	int saldo;
	Osoba wlasciciel;
	
	public Konto(int numer, int saldo, Osoba wlasciciel) {
		super();
		this.numer = numer;
		this.saldo = saldo;
		this.wlasciciel = wlasciciel;
	}

	@Override
	public String toString() {
		return "Konto [numer= " + numer + ", saldo= " + saldo + ", wlasciciel= " + wlasciciel + "]";
	}
	
	void wplata(int kwotaWplaty) {
		saldo += kwotaWplaty;
	}
	
	
	
	
	
}
