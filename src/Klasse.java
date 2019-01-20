import java.util.HashSet;
import java.util.Set;

public class Klasse {
	
	
	protected
		
		String bezeichnung = "";
		int schulstufe;
		
		Raum raum;
		Fach lernt;
		

		public
		Set<Schüler> Klschülerliste = new HashSet<>();
		
		Klasse(String Bezeichnung, int Schulstufe, Raum Raum) {
			this.bezeichnung = Bezeichnung;
			this.schulstufe = Schulstufe;
			this.raum = Raum;
		}
		
		 String getBezeichnung() {
			return bezeichnung;
		}
		
		int getSchulstufe() {
			return schulstufe;
		}
		
		
		Fach getLernt() {
			return lernt;
		}

		void setLernt(Fach lernt) {
			this.lernt = lernt;
		}

	
		/*
		float getDurchschnittsalter() {
			return Durchschnittsalter;
		}
		
		
		
		
		boolean setKlassensprecher() {
			return Klassensprecher;
		}
		
		boolean addSchüler(Schüler schüler) {
					
					i++;
					if(i >= 35){
					return false;
					}
					Klschülerliste.add(schüler);
		}
		
		
		void exportStundenplan() {
			
		}
	*/
}
