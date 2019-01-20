import java.util.HashSet;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class Abteilung {
	
		private
			String kuerzel;
			String name;
			Lehrer av;
			
		public HashSet<Schüler> Abtschülerliste = new HashSet<>();
			
		HashSet<Klasse> klasse = new HashSet<>();
			
		HashSet<Schüler> getSchüler(){
			for(Klasse kl : klasse) {
				Abtschülerliste.addAll(kl.Klschülerliste);
			}
			System.out.println(Abtschülerliste);
			
			return Abtschülerliste;
		}
		 
		Abteilung(String n, String k) {
			name = n;
			kuerzel = k;
		}
}