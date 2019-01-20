import java.util.Date;
import java.util.HashSet;
import java.time.LocalDate;
import java.util.ArrayList;

public class Lehrer extends Mitarbeiter{
	private 
		String kürzel;
		Schule direktor;
		Abteilung av;
	
		HashSet<Fach> unterrichtet = new HashSet<Fach>();
	
	public 
		String getKürzel() {
			return kürzel;
		}

			void setKürzel(String kürzel) {
			this.kürzel = kürzel;
		}
	
			Lehrer(){}
			
			Lehrer(Long svnr, String vorname, String nachname,LocalDate geburtsdatum, String email,String kürzel, Fach unter){
				super(svnr,vorname,nachname,geburtsdatum,email);		//Person
				
				this.kürzel = kürzel;
				unterrichtet = new HashSet<Fach>();
				unterrichtet.add(unter);
	}

			HashSet<Fach> getUnterrichtet() {
				return unterrichtet;
			}

			void setUnterrichtet(HashSet<Fach> unterrichtet) {
				this.unterrichtet = unterrichtet;
			}
			
		
		

}
