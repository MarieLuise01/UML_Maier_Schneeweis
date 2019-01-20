import java.time.LocalDate;

public class Mitarbeiter extends Person{
	
	private 
		static int anzahl;
	
	public 
	
		int getAnzahl() {
			return anzahl;
		}
		
		Mitarbeiter(){
			anzahl++;
		}
		
		Mitarbeiter(Long svnr, String vorname, String nachname,LocalDate geburtsdatum, String email){
			super(svnr,vorname,nachname,geburtsdatum,email);
		
			anzahl++;
		}

}
