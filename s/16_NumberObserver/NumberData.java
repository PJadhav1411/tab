import java.util.ArrayList;
public class NumberData implements Subject {
	
	private int number;
	private ArrayList<Observer> observers;
	
		public NumberData()
		{
		    observers=new ArrayList<>();
		}
	
		public void registerObserver(Observer o)
		{
			observers.add(o);
		}

		public void removeObserver(Observer o)
		{
			int i=observers.indexOf(o);
			if(i>=0)
			{
				observers.remove(i);
			}
		}
		
		public void notifyObserver()
		{
			for(int i=0;i<observers.size();i++)
			{
				Observer observer=(Observer)  observers.get(i);
				observer.update(number);
			}
		}
		
		public void setNumber(Integer number)
		{
			this.number=number;
			notifyObserver();
		}

		
		
		
}
