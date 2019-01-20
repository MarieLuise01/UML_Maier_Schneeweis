
public class Belegung {
	
	protected
	
		int unterrichtsEinheit; 		//"Stunde"
		Unterrichtstag Tag;
		
		Klasse klasse;
		Lehrer lehrer;
		Fach fach;
	
	public 
		Belegung (Unterrichtstag tag, int unterrichtseinheit, Klasse klasse, Lehrer lehrer, Fach fach) {
			this.Tag = tag;
			this.unterrichtsEinheit = unterrichtseinheit;
			
			this.klasse = klasse;
			this.lehrer = lehrer;
			this.fach = fach;
	}
	

	
	void showBelegung() {
		System.out.println(Tag);
		System.out.println(unterrichtsEinheit+". Stunde");
		System.out.println(klasse.bezeichnung);
		System.out.println(lehrer.vorname +" "+ lehrer.nachname);
		System.out.println(fach.name);
	}
}
