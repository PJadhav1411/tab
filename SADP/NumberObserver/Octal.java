
public class Octal implements Observer {
	
	private Integer number;
	private NumberData numberData;
	
	public Octal(NumberData numberData)
	{
		this.numberData = numberData;
		numberData.registerObserver(this);
	}
	
	public void update(Integer number)
	{
		System.out.println("Octal number is "+ Integer.toOctalString(number));
	}
}
