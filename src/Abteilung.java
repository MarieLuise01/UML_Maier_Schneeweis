import java.util.HashSet;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class Abteilung {
	
		private
			String kuerzel;
			String name;
			Lehrer av;
		protected Schule Schule;
		public HashSet<Schüler> Abtschülerliste = new HashSet<>();
			
		HashSet<Klasse> klasse = new HashSet<>();
		HashSet<Lehrer> Lehrerliste = new HashSet<>();
		
		 
		Abteilung(String n, String k) {
			name = n;
			kuerzel = k;
		}
		
		String getName() {
			return name;
		}
		
		String getKuerzel() {
			return kuerzel;
		}
		
		HashSet<Schüler> getSchüler(){
			for(Klasse kl : klasse) {
				Abtschülerliste.addAll(kl.Klschülerliste);
			}
			System.out.println(Abtschülerliste);
			
			return Abtschülerliste;
		}
		
		boolean addLehrer(Lehrer l) {
			return Lehrerliste.add(l);
		}
		
		
		boolean setAbteilungsvorstand(Lehrer l)
		{
			if(Schule.direktor == l) {
				return false;
			}
			this.av = l;
			return true;
		}
		
		
		
		
		
		
		
		
		
}