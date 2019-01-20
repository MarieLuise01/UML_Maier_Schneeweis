
public class Belegung {
	
	protected
	
		int unterrichtsEinheit; 		//"Stunde"
		Unterrichtstag Tag;
		Raum raum;
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
	
	/*void Raumbelegen(Unterrichtstag tag, int unterrichtseinheit, Raum raum, Klasse klasse, Lehrer lehrer, Fach fach) {
		System.out.println("Raum wurde belegt");
	}*/
	
	void showBelegung(Belegung b) {
		System.out.println(this.Tag);
		System.out.println(this.unterrichtsEinheit);
		System.out.println(this.klasse);
		System.out.println(this.lehrer);
		System.out.println(this.fach);
	}
}
