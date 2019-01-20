
import java.util.HashSet;
import java.util.Set;

public class Schule {
	
	private
		String name;
		Long schulkennzahl;
		String schultyp;
	
		Sch�ler Schulsprecher;
		Lehrer direktor;
		public
		Adresse Standort;
		
		HashSet<NichtLehrpersonal> Personalliste = new HashSet<>();
		HashSet<Abteilung> Abteilungsliste = new HashSet<>();
		HashSet<Sch�ler> Sch�lerliste = new HashSet<>();
	
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
	

	public HashSet<Sch�ler> getSch�ler()
	{
		for(Abteilung abt : Abteilungsliste) 
		{	
			Sch�lerliste.addAll(abt.Abtsch�lerliste);
		}
		System.out.println(Sch�lerliste);
		return Sch�lerliste;
	}
	
	
	int getAnzahlSchueler() {
		return Sch�ler.sch�leranzahl;
	}
	
	
}