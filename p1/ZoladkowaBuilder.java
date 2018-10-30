package p1;

public class ZoladkowaBuilder implements VodkaBuilder
{
	private Vodka zoladkowa;
	
	public ZoladkowaBuilder()
	{
		zoladkowa = new Vodka();
	}
	
	@Override
	public void buildButelka() {
		Butelka butelka = new Butelka();
		butelka.setPojemnosc(700);
		zoladkowa.setButelka(butelka);
		
	}

	@Override
	public void buildGorzola() {
		Gorzola gorzola = new Gorzola();
		gorzola.setProcent(40);
		gorzola.setTrunek("wódka");
		zoladkowa.setGorzola(gorzola);
	}

	@Override
	public Vodka getVodka() {
		return zoladkowa;
	}

}
