package p1;

public class VodkaDirector {

	private VodkaBuilder vodkaBuilder;
	
	public VodkaDirector (VodkaBuilder vodkaBuilder)
	{
		this.vodkaBuilder = vodkaBuilder;
	}
	
	public void makeVodka()
	{
		vodkaBuilder.buildButelka();
		vodkaBuilder.buildGorzola();
	}
	
	public Vodka getVodka()
	{
		return vodkaBuilder.getVodka();
	}
}
