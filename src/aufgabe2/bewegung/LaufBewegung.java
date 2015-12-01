package aufgabe2.bewegung;

import aufgabe2.lebewesen.Lebewesen;

public final class LaufBewegung
	extends AbstractBewegung
{

	@Override
	public void bewegDich(
			final Lebewesen lebewesenToBeweg )
	{
		System.out.println( lebewesenToBeweg.name + " l‰uft" );
	}
}
