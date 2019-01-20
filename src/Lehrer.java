import java.util.Date;
import java.util.HashSet;
import java.time.LocalDate;
import java.util.ArrayList;

public class Lehrer extends Mitarbeiter{
	private 
		String k�rzel;
		Schule direktor;
		Abteilung av;
	
		HashSet<Fach> unterrichtet = new HashSet<Fach>();
	
	public 
		String getK�rzel() {
			return k�rzel;
		}

			void setK�rzel(String k�rzel) {
			this.k�rzel = k�rzel;
		}
	
			Lehrer(){}
			
			Lehrer(Long svnr, String vorname, String nachname,LocalDate geburtsdatum, String email,String k�rzel, Fach unter){
				super(svnr,vorname,nachname,geburtsdatum,email);		//Person
				
				this.k�rzel = k�rzel;
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
