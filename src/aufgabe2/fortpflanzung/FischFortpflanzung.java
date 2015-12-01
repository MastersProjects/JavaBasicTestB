package aufgabe2.fortpflanzung;

import aufgabe2.lebewesen.Lebewesen;

public final class FischFortpflanzung
	extends AbstractFortpflanzung
{

	@Override
	public void fortpflanzDich(
			final Lebewesen lebewesenToFortpflanz)
	{
		System.out.println( lebewesenToFortpflanz.name + " legt Rogen ab" );
	}

}
