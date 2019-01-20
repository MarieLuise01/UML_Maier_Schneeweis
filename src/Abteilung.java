import java.util.HashSet;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class Abteilung {
	
		private
			String kuerzel;
			String name;
			Lehrer av;
			Sch�ler Abteilungssprecher;
			Lehrer Abteilungsvorstand;
			protected Schule Schule;
		
		public 
		HashSet<Sch�ler> Abtsch�lerliste = new HashSet<>();	
		HashSet<Klasse> klasse = new HashSet<>();
		HashSet<Lehrer> Lehrerliste = new HashSet<>();
		
		 
		Abteilung(String n, String k) {
			name = n;
			kuerzel = k;
			Abteilungssprecher = null; 
			Abteilungsvorstand = null;
		}
		
		String getName() {
			return name;
		}
		
		String getKuerzel() {
			return kuerzel;
		}
		
		HashSet<Sch�ler> getSch�ler(){
			for(Klasse kl : klasse) {
				Abtsch�lerliste.addAll(kl.Klsch�lerliste);
			}
			System.out.println(Abtsch�lerliste);
			
			return Abtsch�lerliste;
		}
		
		boolean addLehrer(Lehrer l) {
			return Lehrerliste.add(l);
		}
		
		
		public boolean setAbteilungsvorstand(Lehrer l)
		{
			if(Schule.direktor == l) {
				return false;
			}
			else {
			this.av = l;
			return true;
			}
		}
		
		public Lehrer getAbteilungsvorstand() {
			return Abteilungsvorstand;
		}
		
		
		
		
		
		
		
		
		
}