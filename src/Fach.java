
import java.util.ArrayList;

public class Fach {
	protected
	
	String name="";
	int Wochenstunden;
	Raumtyp raumanforderung;
	
	Raum UnterrichtetIn;
	ArrayList<Klasse> gelerntVon;
	ArrayList<Lehrer> Lehrer;
	
	public
	
	Fach(String Name,int Wochenstunden, Raumtyp raumanforderung , Raum UnterrichtetIn) {
		this.name = Name;
		this.Wochenstunden = Wochenstunden;
		this.raumanforderung = raumanforderung;
		this.UnterrichtetIn = UnterrichtetIn;
	}
	
	
	
	String getName() {
		return name;
	}
	int getWochenstunden() {
		return Wochenstunden;
	}
	Raumtyp getRaumanforderung() {
		return raumanforderung;
	}
	
	Raum getUnterrichtetIn() {
		return UnterrichtetIn;
	}
	
	
	void setUnterrichtetIn(Raum unterrichtetIn) {
		UnterrichtetIn = unterrichtetIn;
	}



	ArrayList<Klasse> getGelerntVon() {
		return gelerntVon;
	}



	void setGelerntVon(ArrayList<Klasse> gelerntVon) {
		this.gelerntVon = gelerntVon;
	}



	ArrayList<Lehrer> getLehrer() {
		return Lehrer;
	}



	void setLehrer(ArrayList<Lehrer> lehrer) {
		Lehrer = lehrer;
	}
	
	
	void belegt(Belegung belegt) {
		
	}
	

}
