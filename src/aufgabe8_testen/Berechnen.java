package aufgabe8_testen;

public class Berechnen {
	private int result;
	
	protected void berechnen(int laenge, int breite, int hoehe){
		result = laenge*breite*hoehe;
		System.out.println(result + "cm3");
	}
	
	protected int getResultat(){
		return result;
	}

}
