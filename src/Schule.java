
import java.util.HashSet;
import java.util.Set;

public class Schule {
	
	private
		String name;
		Long schulkennzahl;
		String schultyp;
		
		Adresse Standort;
		Schüler Schulsprecher;
		Lehrer direktor;
		
		HashSet<NichtLehrpersonal> Personalliste = new HashSet<>();
		HashSet<Abteilung> Abteilungsliste = new HashSet<>();
		HashSet<Schüler> Schülerliste = new HashSet<>();
	
	boolean addPersonal(NichtLehrpersonal personal)
	{
		return Personalliste.add(personal);
	}
	public Abteilung addAbteilung(String name, String kuerzel)
	{
		Abteilung neueAbteilung = new Abteilung(name, kuerzel);
		Abteilungsliste.add(neueAbteilung);
		return neueAbteilung;
	}
	
	//setters
	
	boolean setDirektor(Lehrer lehrer)
	{
		for(Abteilung abtliste : Abteilungsliste) {
			if(abtliste.av == lehrer) {
				return false;
			}	
		}
		this.direktor = lehrer;
		return true;
	}
	
	//getters
	
	long getSchulkennzahl() {
		return schulkennzahl;
	}
	
	String getName() {
		return name;
	}
	
	String getSchultyp() {
		return schultyp;
	}
	
	//getPersonal
	public HashSet<NichtLehrpersonal> getPersonal(){
		
		return this.Personalliste;
	}
	

	public HashSet<Schüler> getSchüler()
	{
		for(Abteilung abt : Abteilungsliste) 
		{	
			Schülerliste.addAll(abt.Abtschülerliste);
		}
		System.out.println(Schülerliste);
		return Schülerliste;
	}
	
	
	int getAnzahlSchueler() {
		return Schüler.schüleranzahl;
	}
	
	
}