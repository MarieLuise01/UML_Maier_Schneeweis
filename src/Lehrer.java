import java.util.Date;

public class Lehrer extends Mitarbeiter{
	private 
		String kürzel = "";

	public 
		String getKürzel() {
			return kürzel;
		}

			void setKürzel(String kürzel) {
			this.kürzel = kürzel;
		}
	
			Lehrer(){}
			Lehrer(Long svnr, String vorname, String nachname,Date geburtsdatum, String email,String kürzel){
				
				super(svnr,vorname,nachname,geburtsdatum,email);		//Person
				
				this.kürzel = kürzel;
		
	}
		

}
