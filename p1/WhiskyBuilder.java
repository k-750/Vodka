package p1;

public class WhiskyBuilder implements VodkaBuilder
{
	
	private Vodka whisky;
	
	public WhiskyBuilder()
	{
		whisky = new Vodka();
	}

	@Override
	public void buildButelka() {
		Butelka butelka = new Butelka();
		butelka.setPojemnosc(500);
		whisky.setButelka(butelka);
	}

	@Override
	public void buildGorzola() {
		Gorzola gorzola = new Gorzola();
		gorzola.setProcent(40);
		gorzola.setTrunek("Old Scotch Whiskey");
		whisky.setGorzola(gorzola);
	}

	@Override
	public Vodka getVodka() {
		return whisky;
	}
	
	
}
