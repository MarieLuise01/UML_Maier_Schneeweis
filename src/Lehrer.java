import java.util.Date;
import java.util.ArrayList;

public class Lehrer extends Mitarbeiter{
	private 
		String kürzel = "";
		Schule direktor;
		Abteilung av;
	
		ArrayList<Fach> unterrichtet;
	
	public 
		String getKürzel() {
			return kürzel;
		}

			void setKürzel(String kürzel) {
			this.kürzel = kürzel;
		}
	
			Lehrer(){}
			Lehrer(Long svnr, String vorname, String nachname,Date geburtsdatum, String email,String kürzel, ArrayList<Fach> unterrichtet){
				super(svnr,vorname,nachname,geburtsdatum,email);		//Person
				
				this.kürzel = kürzel;
				this.unterrichtet= unterrichtet;
	}

			ArrayList<Fach> getUnterrichtet() {
				return unterrichtet;
			}

			void setUnterrichtet(ArrayList<Fach> unterrichtet) {
				this.unterrichtet = unterrichtet;
			}
			
		
		

}
