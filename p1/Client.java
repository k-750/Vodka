package p1;

public class Client {

	public static void main(String[] args) {
		
		VodkaBuilder vodkaBuilder = new ZoladkowaBuilder();
		VodkaDirector vodkaDirector = new VodkaDirector(vodkaBuilder);
		vodkaDirector.makeVodka();
		Vodka zoladkowa = vodkaDirector.getVodka();
		
		vodkaBuilder = new WhiskyBuilder();
		vodkaDirector = new VodkaDirector(vodkaBuilder);
		vodkaDirector.makeVodka();
		Vodka whiskey = vodkaDirector.getVodka();
		
		System.out.println("Wódka: "+whiskey.getGorzola().getTrunek()+" "+whiskey.getGorzola().getProcent()+"%, "+whiskey.getButelka().getPojemnosc()+"ml");

		System.out.println("Wódka: "+zoladkowa.getGorzola().getTrunek()+" "+zoladkowa.getGorzola().getProcent()+"%, "+zoladkowa.getButelka().getPojemnosc()+"ml");
	}

}
