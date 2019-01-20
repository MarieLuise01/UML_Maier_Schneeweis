import java.time.LocalDate;


public class Person {

	protected
		Long svnr;
		String vorname = "";
		String nachname = "";
	
		LocalDate geburtsdatum ;
	
		String email = "";
	
		
	
	public 
	//getters
		Long getSvnr(){
			return svnr;
		}
	
		String getVorname() {
			return vorname;
		}
		
		String getNachname() {
			return nachname;
		}
		
		LocalDate getGeburtsdatum() {
			return geburtsdatum;
		}
		
		String getEmail() {
			return email;
		}

	//setters
		void setSvnr(Long svnr) {
			this.svnr = svnr;
		}

		void setVorname(String vorname) {
			this.vorname = vorname;
		}

		void setNachname(String nachname) {
			this.nachname = nachname;
		}

		void setGeburtsdatum(LocalDate geburtsdatum) {
			this.geburtsdatum = geburtsdatum;
		}

		void setEmail(String email) {
			this.email = email;
		}
		
		
		Person(){}
		Person (Long svnr, String vorname, String nachname, LocalDate geburtsdatum, String email){
			
			this.svnr = svnr;
			this.vorname = vorname;
			this.nachname = nachname;
			this.geburtsdatum = geburtsdatum;
			this.email = email;
		}
		
		
}
