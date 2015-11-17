package aufgabe8_testen;

public class Berechnen {
	double resultat;
	
	protected double berechnen(double laenge, double breite, double hoehe){
		resultat = laenge*breite*hoehe;
		System.out.println(resultat + "cm3");
		return resultat;
	}

}
