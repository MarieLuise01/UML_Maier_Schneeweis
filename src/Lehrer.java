import java.util.Date;

public class Lehrer extends Mitarbeiter{
	private 
		String k�rzel = "";

	public 
		String getK�rzel() {
			return k�rzel;
		}

			void setK�rzel(String k�rzel) {
			this.k�rzel = k�rzel;
		}
	
			Lehrer(){}
			Lehrer(Long svnr, String vorname, String nachname,Date geburtsdatum, String email,String k�rzel){
				
				super(svnr,vorname,nachname,geburtsdatum,email);		//Person
				
				this.k�rzel = k�rzel;
		
	}
		

}
