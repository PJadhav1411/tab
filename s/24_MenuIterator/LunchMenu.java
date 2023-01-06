import java.util.ArrayList;
import java.util.List;

public class LunchMenu implements IMenu{
	
	List<String> items = new ArrayList<String> ();
	
	public LunchMenu()
	{
		items.add("Pav Bhaji");
		items.add("Biryani");
		items.add("Rice Plate");
		items.add("Kima Pav");
	}

	@Override
	public Iterator<String> getIterator() {
		// TODO Auto-generated method stub
		return new LunchMeunIterator();
	}
	
	class LunchMeunIterator implements Iterator
	{  
		int index=0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index<items.size();
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return items.get(index++);
		}
		
	}
	
	

}
