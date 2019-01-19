
public class Adresse {
	private
		String ort;
		String strasse;
		int hausnummer;
		int plz;
		Person Wohnort;
	
	public
	
	Adresse(){}
	Adresse(String strasse, int hausnummer, int plz, String ort){
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
	}
	//getters
	
	String getOrt(){
		return ort;
	}
	
	String getStrasse(){
		return strasse;
	}
	
	int getHausnummer(){
		return hausnummer;
	}
	
	int getPlz(){
		return plz;
	}
	
	void printAdresse(){
		String adresse = strasse + " " + hausnummer + "\n" + plz + " " + ort;
		System.out.println(adresse);
	}
}
