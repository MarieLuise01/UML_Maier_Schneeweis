import java.time.LocalDate;


public class NichtLehrpersonal extends Mitarbeiter{
	
	int Schule = 0;
	
	NichtLehrpersonal(){}
	
	NichtLehrpersonal(Long svnr, String vorname, String nachname,LocalDate geburtsdatum, String email, int Schule){
		super(svnr,vorname,nachname,geburtsdatum,email);
		//this.svnr = svnr;
		//this.vorname = vorname;
		//this.nachname = nachname;
		//this.geburtsdatum = geburtsdatum;
		//this.email = email;
		this.Schule = 1;
	}
	
}
