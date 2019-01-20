import java.util.Date;
import java.util.ArrayList;

public class Lehrer extends Mitarbeiter{
	private 
		String k�rzel = "";
		Schule direktor;
		Abteilung av;
	
		ArrayList<Fach> unterrichtet;
	
	public 
		String getK�rzel() {
			return k�rzel;
		}

			void setK�rzel(String k�rzel) {
			this.k�rzel = k�rzel;
		}
	
			Lehrer(){}
			Lehrer(Long svnr, String vorname, String nachname,Date geburtsdatum, String email,String k�rzel, ArrayList<Fach> unterrichtet){
				super(svnr,vorname,nachname,geburtsdatum,email);		//Person
				
				this.k�rzel = k�rzel;
				this.unterrichtet= unterrichtet;
	}

			ArrayList<Fach> getUnterrichtet() {
				return unterrichtet;
			}

			void setUnterrichtet(ArrayList<Fach> unterrichtet) {
				this.unterrichtet = unterrichtet;
			}
			
		
		

}
