
public class Binary  implements Observer{
	
	private int number;
	private NumberData numberData;
	
	public Binary(NumberData numberData)
	{
		this.numberData = numberData;
		numberData.registerObserver(this);
	}
	
	public void update(Integer number)
	{
		System.out.println("Binary number is"+Integer.toBinaryString(number));
	}
	
	

}
