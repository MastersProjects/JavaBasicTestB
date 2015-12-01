package aufgabe2.fortpflanzung;

import aufgabe2.lebewesen.Lebewesen;

public final class SaeugetierFortpflanzung
	extends AbstractFortpflanzung
{

	@Override
	public void fortpflanzDich(
			final Lebewesen lebewesenToFortpflanz)
	{
		System.out.println( lebewesenToFortpflanz.name + " gebiert" );
		System.out.println( lebewesenToFortpflanz.name + " s‰ugt" );
	}

}
