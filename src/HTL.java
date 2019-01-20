import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
public class HTL {

	public static void main(String[] args) {

		Schule HTL = new Schule("HTL STP", 1234L, "BHS");
		
		Abteilung el = new Abteilung("Elektronik","EL");
		Abteilung inf = new Abteilung("Informatik","IF");
		
		HTL.addAbteilung(el);
		HTL.addAbteilung(inf);
		HTL.Standort = new Adresse("Waldstraße", 3, 3103, "St.Pölten");
		
		Raum V111= new Raum("V111",22,Raumtyp.LABORRAUM); 
		Raum W211= new Raum("V111",22,Raumtyp.KLASSENRAUM); 
		Raum V116= new Raum("V111",22,Raumtyp.LABORRAUM); 
		Raum W212= new Raum("V111",22,Raumtyp.KLASSENRAUM); 
		Raum V115= new Raum("V111",22,Raumtyp.LABORRAUM); 
		
		Fach HWE = new Fach("HWE", 4, Raumtyp.LABORRAUM, V111);
		Fach DIC = new Fach("HWE", 4,Raumtyp.KLASSENRAUM , W211);
		Fach Labor = new Fach("HWE", 4, Raumtyp.LABORRAUM, V116);
		Fach FSST = new Fach("HWE", 4, Raumtyp.KLASSENRAUM, W212);
		Fach GGP = new Fach("HWE", 4, Raumtyp.LABORRAUM, V115);
		
		Raum W213 = new Raum("W213", 22, Raumtyp.KLASSENRAUM);
		Raum W214 = new Raum("W214", 22, Raumtyp.KLASSENRAUM);
		Raum W215 = new Raum("W215", 22, Raumtyp.KLASSENRAUM);
		
		Klasse AHELS4 = new Klasse("4AHELS", 4, W211);
		Klasse BHELS4 = new Klasse("4BHELS", 4, W212);
		Klasse AHELS3 = new Klasse("3AHELS", 3, W213);
		Klasse BHELS3 = new Klasse("3BHELS", 3, W214);
		Klasse AHELS2 = new Klasse("2AHELS", 2, W215);
		
		Lehrer Crha = new Lehrer(012345L, "Christian", "Crha", LocalDate.of(1975,07,03), "email", "CRHA", HWE);
		Lehrer Tillich = new Lehrer(123456L, "Markus", "Tillich", LocalDate.of(1975,05,03), "email", "TILL", DIC);
		Lehrer Walter = new Lehrer(234567L, "Martin", "Walter", LocalDate.of(1978,11,30), "email", "CRHA", Labor);
		Lehrer Wagner = new Lehrer(345678L, "Herbert", "Wagner", LocalDate.of(1980,04,12), "email", "CRHA", FSST);
		Lehrer Peham = new Lehrer(456789L, "Christoph", "Peham", LocalDate.of(1985,03,01), "email", "CRHA", GGP);
		
		
		
		
		NichtLehrpersonal Christina = new NichtLehrpersonal(012345L, "Christina", "Winter", LocalDate.of(1995, 12, 05), "email", 1);
		NichtLehrpersonal Hans = new NichtLehrpersonal(012345L, "Hans", "Lang", LocalDate.of(1995, 12, 05), "email", 1);
		NichtLehrpersonal Peter = new NichtLehrpersonal(012345L, "Peter", "Böswarth", LocalDate.of(1995, 12, 05), "email", 1);
		NichtLehrpersonal Franz = new NichtLehrpersonal(012345L, "Franz", "Peter", LocalDate.of(1995, 12, 05), "email", 1);
		NichtLehrpersonal Susi = new NichtLehrpersonal(012345L, "Susanne", "Winter", LocalDate.of(1995, 12, 05), "email", 1);
		
		 Schüler Dominik = new Schüler(0123456L, "Dominik", "Tesch", LocalDate.of(1999, 02, 07),17, "email", 20, true, LocalDate.of(2015, 9, 03));		
		 Schüler Marie = new Schüler(0123456L, "Marie", "Maier", LocalDate.of(2001, 03, 01), 18, "email", 12, true, LocalDate.of(2015, 9, 03));
		 Schüler Flo = new Schüler(0123456L, "Florian", "Schneeweis", LocalDate.of(1999, 07, 07), 19, "email", 21, true, LocalDate.of(2015, 9, 03));
		 Schüler Simon = new Schüler(0123456L, "Simon", "Brait", LocalDate.of(1999, 02, 07), 18,  "email", 1, true, LocalDate.of(2015, 9, 03));
		 Schüler Paul = new Schüler(0123456L, "Paul", "Pirkfellner", LocalDate.of(1999, 02, 07), 17, "email", 18, true, LocalDate.of(2015, 9, 03));
		
		AHELS4.setKlassensprecher(Marie);
		BHELS4.setKlassensprecher(Dominik);
		AHELS3.setKlassensprecher(Flo);
		BHELS3.setKlassensprecher(Simon);
		AHELS2.setKlassensprecher(Paul);
		
		
		
		System.out.println(HTL.getName() );
		
		System.out.println("hat "+HTL.getAnzahlSchueler()+" Schüler");
		
		
		
		W213.belegen(Unterrichtstag.MONTAG , 1 , AHELS4 , Crha,DIC );
		
		System.out.println(" ");
		W213.showbelegungen();
		
		
		;
		
	}

}
