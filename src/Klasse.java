
public class Klasse {
	
	
	protected
		
		String bezeichnung = "";
		int schulstufe;
		
		Raum raum;
		Fach lernt;
		

		public
		
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
		
		boolean addSchüler() {
			return Schüler;
					
		}
		
		
		void exportStundenplan() {
			
		}
	*/
}
