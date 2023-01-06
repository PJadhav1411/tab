import java.util.ArrayList;
import java.util.List;

public class BreakFastMeun  implements IMenu{

	List<String> items = new ArrayList<String>();
	
	public BreakFastMeun()
	{
		items.add("Pohe");
		items.add("Upma");
		items.add("Shira");
		items.add("Idli");
	}
	@Override
	public Iterator<String> getIterator() {
		// TODO Auto-generated method stub
		return new BreakFastIterator();
	}
	class BreakFastIterator implements Iterator
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
