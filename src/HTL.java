import java.util.Date;
public class HTL {

	public static void main(String[] args) {
		
		Person p1 = new Person (124L,"Peter","M�ller",new  Date ((2000-1900),1,17),"pm.at");
		Sch�ler s1 = new Sch�ler(12L,"Hubert","Huber",new Date((2000-1900),5,18),"dre.email",15,true,new Date((2000-1900),4,23));
		
		Lehrer l = new Lehrer(1L,"MArtin","Walter", new Date((1977-1900),4,2),"ww.at","WALT");
		Lehrer anzahl = new Lehrer();
		
		System.out.println(p1.getGeburtsdatum());
		System.out.println(s1.getEmail());
		
		System.out.println(l.getVorname());
		
		System.out.println(anzahl.getAnzahl());
	
		Adresse a = new Adresse("Waldstrasse", 3, 3101, "St.P�lten");
		a.printAdresse();
	
		
	}

}
