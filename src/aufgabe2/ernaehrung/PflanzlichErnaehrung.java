package aufgabe2.ernaehrung;

import aufgabe2.lebewesen.Lebewesen;

public final class PflanzlichErnaehrung
	extends AbstractErnaehrung
{

	@Override
	public void ernaehreDich(
			final Lebewesen lebewesenToErnaehr )
	{
		System.out.println( lebewesenToErnaehr.name + " frisst Pflanzen" );
	}
}
