import java.util.HashSet;


public class Klasse {
	
	
		String bezeichnung = "";
		int schulstufe;
		Sch�ler klassensprecher;
		
		Raum raum;
		Fach lernt;
		

		public
		HashSet<Sch�ler> Klsch�lerliste = new HashSet<>();
		
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
			for(Sch�ler schliste : Klsch�lerliste) {
				alt = ;
			}
			return Durchschnittsalter;
		}
		*/	
		
		boolean setKlassensprecher(Sch�ler sch�ler) {
			if(klassensprecher == sch�ler) {
				return false;
			}
			klassensprecher = sch�ler;
			return true;
		}
		
		Sch�ler getKlassensprecher(Klasse klasse) {
			return this.klassensprecher;
		}
		
		int i;
		boolean addSch�ler(Sch�ler sch�ler) {
					
					i++;
					if( i >= 35){
					return false;
					}
					Klsch�lerliste.add(sch�ler);
					return true;
					
		}
		
		
		void exportStundenplan() {
			
		}
}
