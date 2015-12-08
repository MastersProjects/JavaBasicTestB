package aufgabe2.lebewesen;

import java.util.ArrayList;
import java.util.List;

import aufgabe2.bewegung.AbstractBewegung;
import aufgabe2.bewegung.FliegBewegung;
import aufgabe2.bewegung.LaufBewegung;
import aufgabe2.ernaehrung.AbstractErnaehrung;
import aufgabe2.ernaehrung.PflanzlichErnaehrung;
import aufgabe2.ernaehrung.TierischErnaehrung;
import aufgabe2.fortpflanzung.AbstractFortpflanzung;
import aufgabe2.fortpflanzung.VogelFortpflanzung;
import aufgabe2.fortpflanzung.SaeugetierFortpflanzung;

public final class Lebewesen
{
	public final String name;

	public final AbstractBewegung bewegung;
	
	public final AbstractErnaehrung ernaehrung;
	
	public final AbstractFortpflanzung fortpflanzung;

	public Lebewesen(
			final String name , 
			final AbstractBewegung bewegung ,
			final AbstractErnaehrung ernaehrung , 
			final AbstractFortpflanzung fortpflanzung ) {
		// TODO null-Parameter abweisen
		this.name = name;
		this.bewegung = bewegung;
		this.ernaehrung = ernaehrung;
		this.fortpflanzung = fortpflanzung;
	}
	
	public void bewegDich() {
		this.bewegung.bewegDich( this );
	}
	
	public void ernaehreDich() {
		this.ernaehrung.ernaehreDich( this );
	}

	public void fortpflanzDich() {
		this.fortpflanzung.fortpflanzDich( this );
	}
	
	public static void main(String[] args) {
		final List<Lebewesen> lebewesenList =
			new ArrayList<Lebewesen>();
		
		final Lebewesen adler =
			new Lebewesen(
					"Adler" ,
					// zur Vereinfachung kann der Adler nur 
					// fliegen, nicht laufen
					new FliegBewegung() ,
					new TierischErnaehrung() ,
					new VogelFortpflanzung() );
		
		lebewesenList.add( adler );
		
		final Lebewesen elefant =
			new Lebewesen(
					"Elefant" ,
					// zur Vereinfachung kann der Elefant nur 
					// laufen und nicht schwimmen
					new LaufBewegung() ,
					new PflanzlichErnaehrung() ,
					new SaeugetierFortpflanzung() );
		
		lebewesenList.add( elefant );

		/* Und jetzt geht es los.
		 */
		for ( Lebewesen lebewesen : lebewesenList )
		{
			lebewesen.bewegDich();
			lebewesen.ernaehreDich();
			lebewesen.fortpflanzDich();
			
			System.out.println();
		}
	}
}
