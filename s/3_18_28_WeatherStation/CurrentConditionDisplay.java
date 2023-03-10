
public class CurrentConditionDisplay  implements Observer,DisplayElement{
	   
	private float temp;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData)
	{
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temp,float humidity,float pressure)
	{
		this.temp=temp;
		this.humidity=humidity;
		display();
	}
	
	public void display()
	{
		System.out.println("Current conditions "+ temp + "F degree and" + humidity +"% humidity");
		System.out.println("-----------------------");
	}
}
