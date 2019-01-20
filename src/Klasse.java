import java.util.HashSet;


public class Klasse {
	
	
		String bezeichnung = "";
		int schulstufe;
		Schüler klassensprecher;
		
		Raum raum;
		Fach lernt;
		

		public
		HashSet<Schüler> Klschülerliste = new HashSet<>();
		
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
		
		void setSchulstufe(int s) {
			this.schulstufe = s;
		}
		
		Fach getLernt() {
			return lernt;
		}
		
		//setters

		void setLernt(Fach lernt) {
			this.lernt = lernt;
		}

	

		/*float getDurchschnittsalter() {
			int alt = 0;
			for(Schüler schliste : Klschülerliste) {
				alt = ;
			}
			return Durchschnittsalter;
		}
		*/	
		
		boolean setKlassensprecher(Schüler schüler) {
			if(klassensprecher == schüler) {
				return false;
			}
			klassensprecher = schüler;
			return true;
		}
		
		Schüler getKlassensprecher(Klasse klasse) {
			return this.klassensprecher;
		}
		
		int i;
		boolean addSchüler(Schüler schüler) {
					
					i++;
					if( i >= 35){
					return false;
					}
					Klschülerliste.add(schüler);
					return true;
					
		}
		
		
		void exportStundenplan() {
			
		}
}
