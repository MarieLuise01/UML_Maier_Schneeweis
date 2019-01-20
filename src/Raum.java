
import java.util.ArrayList;

public class Raum {

	protected
	
	String raumNummer = "";
	int maxSitzpl�tze;
	
	Raumtyp raumtyp;
	
	Klasse StammklasseVon;
	
	ArrayList<Fach> unterrichtListe;
	
	Belegung belegen;
	
	ArrayList<Belegung> belegungen = new ArrayList();
	public

	

	Raum(String raumnummer, int Sitzpl�tze, Raumtyp raumart) {
		this.raumNummer = raumnummer;
		this.maxSitzpl�tze = Sitzpl�tze;
		this.raumtyp = raumart;
		
	}
	

	String getRaumNummer() {
		return raumNummer;
	}

	int getMaxSitpl�tze() {
		return maxSitzpl�tze;
	}

	Raumtyp getRaumtyp() {
		return raumtyp;
	}
	
	
	void setStammklasseVon(Klasse stammklasseVon) {
		StammklasseVon = stammklasseVon;
	}

	 
	ArrayList<Fach> getUnterrichtListe() {
		return unterrichtListe;
	}


	void setUnterrichtListe(ArrayList<Fach> unterrichtListe) {
		this.unterrichtListe = unterrichtListe;
	}


	void exportBelegung() {
		
	}
	
	void belegen(Unterrichtstag tag, int unterrichtseinheit, Klasse klasse, Lehrer lehrer, Fach fach) {
		Belegung b = new Belegung(tag,unterrichtseinheit,klasse,lehrer,fach); 
		
		//belegungen.add(b);
	}
	
	

	
	void showbelegungen() {
		int size;
		size = belegungen.size();
		System.out.println("size = "+size);
		for(int i = 0; i<size;i++) {
			belegungen.get(i).showBelegung();
			
			
		}
		
		
	}
}
