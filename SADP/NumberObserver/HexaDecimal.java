
public class HexaDecimal implements Observer {

	private int number;
	private NumberData numberData;
	
	public HexaDecimal(NumberData numberData)
	{
		this.numberData=numberData;
		numberData.registerObserver(this);
	}
	
	public void update(Integer number)
	{
		System.out.println("Hexadecimal number is  "+Integer.toHexString(number));
	}
}
