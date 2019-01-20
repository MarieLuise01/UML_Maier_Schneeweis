import java.util.Date;
import java.util.Iterator;
public class HTL {

	public static void main(String[] args) {
		
		Person p1 = new Person (124L,"Peter","Müller",new  Date ((2000-1900),1,17),"pm.at");
		Schüler s1 = new Schüler(12L,"Hubert","Huber",new Date((2000-1900),5,18),"dre.email",15,true,new Date((2000-1900),4,23));
		
		
		Lehrer anzahl = new Lehrer();
		Adresse a = new Adresse("Waldstrasse", 3, 3101, "St.Pölten");
		
		
		Raum w211= new Raum("W211",22,Raumtyp.KLASSENRAUM); 
		
		Fach GGP = new Fach("GGP",2,Raumtyp.KLASSENRAUM,w211);
	
		
		
		
		Lehrer l = new Lehrer(1L,"MArtin","Walter", new Date((1977-1900),4,2),"ww.at","WALT",null);
		
		Klasse vier_A = new Klasse("4a",4,w211);
		w211.setStammklasseVon(vier_A);
		
		w211.belegen(Unterrichtstag.DIENSTAG,1,vier_A,l , GGP);
		
		w211.showbelegungen();
		
		
		
	}

}
