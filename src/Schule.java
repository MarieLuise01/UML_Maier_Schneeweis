
import java.util.HashSet;
import java.util.Set;

public class Schule {
	
	private
		String name;
		Long schulkennzahl;
		String schultyp;
	
		Schüler Schulsprecher;
		Lehrer direktor;
		public
		Adresse Standort;
		
		HashSet<NichtLehrpersonal> Personalliste = new HashSet<>();
		HashSet<Abteilung> Abteilungsliste = new HashSet<>();
		HashSet<Schüler> Schülerliste = new HashSet<>();
	
	Schule(){}
	Schule(String name, Long schulkennzahl,String schultyp){
		this.name = name;
		this.schulkennzahl = schulkennzahl;
		this.schultyp = schultyp;
	}
		
	boolean addPersonal(NichtLehrpersonal personal)
	{
		return Personalliste.add(personal);
	}
	public void addAbteilung(Abteilung abt)
	{
		
		Abteilungsliste.add(abt);
		
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