import java.util.Date;
import java.util.HashSet;


public class Schüler extends Person{
	
	private
		int katalognummer;
		boolean eigenberechtigt;
		Date eintrittsdatum;
	protected	
		static int schüleranzahl;
	public
		HashSet<Schüler> Schülerliste = new HashSet<>();
	
	public
	
	
	//getters
	

		int getKatalognummer() {
			return katalognummer;
		}

		boolean isEigenberechtigt() {
			return eigenberechtigt;
		}

		Date getEintrittsdatum() {
			return eintrittsdatum;
		}
		
		
	//setters
		void setKatalognummer(int katalognummer) {
			this.katalognummer = katalognummer;
		}
		
		void setEigenberechtigt(boolean eigenberechtigt) {
			this.eigenberechtigt = eigenberechtigt;
		}
		
		void setEintrittsdatum(Date eintrittsdatum) {
			this.eintrittsdatum = eintrittsdatum;
		}
	
		Schüler(){schüleranzahl++;}
		
		Schüler(long svnr, String vorname, String nachname, Date geburtsdatum,
				String email, int katalognummer, boolean eigenberechtigt,Date eintrittsdatum){
			super(svnr, vorname, nachname, geburtsdatum, email);
			
			this.katalognummer = katalognummer;
			this.eigenberechtigt = eigenberechtigt;
			this.eintrittsdatum = eintrittsdatum;
			schüleranzahl++;
		}
		
		
}
