import java.time.LocalDate;

import java.util.HashSet;


public class Schüler extends Person{
	
	private
		int alter;
		int katalognummer;
		boolean eigenberechtigt;
		LocalDate eintrittsdatum;
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

		LocalDate getEintrittsdatum() {
			return eintrittsdatum;
		}
		
		
	//setters
		void setKatalognummer(int katalognummer) {
			this.katalognummer = katalognummer;
		}
		
		void setEigenberechtigt(boolean eigenberechtigt) {
			this.eigenberechtigt = eigenberechtigt;
		}
		
		void setEintrittsdatum(LocalDate eintrittsdatum) {
			this.eintrittsdatum = eintrittsdatum;
		}
	
		Schüler(){schüleranzahl++;}
		
		Schüler(long svnr, String vorname, String nachname, LocalDate geburtsdatum, int alter,
				String email, int katalognummer, boolean eigenberechtigt,LocalDate eintrittsdatum){
			super(svnr, vorname, nachname, geburtsdatum, email);
			
			this.katalognummer = katalognummer;
			this.eigenberechtigt = eigenberechtigt;
			this.eintrittsdatum = eintrittsdatum;
			schüleranzahl++;
		}
		
		
}
