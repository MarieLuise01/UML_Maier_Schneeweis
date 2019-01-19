import java.util.Date;

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
		
		Mitarbeiter(Long svnr, String vorname, String nachname,Date geburtsdatum, String email){
			super(svnr,vorname,nachname,geburtsdatum,email);
		
			anzahl++;
		}

}
