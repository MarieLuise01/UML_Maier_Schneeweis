import java.util.HashSet;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class Abteilung {
	
		private
			String kuerzel;
			String name;
			Lehrer av;
			
		public HashSet<Sch�ler> Abtsch�lerliste = new HashSet<>();
			
		HashSet<Klasse> klasse = new HashSet<>();
			
		HashSet<Sch�ler> getSch�ler(){
			for(Klasse kl : klasse) {
				Abtsch�lerliste.addAll(kl.Klsch�lerliste);
			}
			System.out.println(Abtsch�lerliste);
			
			return Abtsch�lerliste;
		}
		 
		Abteilung(String n, String k) {
			name = n;
			kuerzel = k;
		}
}