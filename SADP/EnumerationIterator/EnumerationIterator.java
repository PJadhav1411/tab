import java.util.Enumeration;
public class EnumerationIterator<T> implements Iterator<T>{

	Enumeration<T> e;
	
	public EnumerationIterator(Enumeration<T> e)
	{
		this.e = e;
	}
	
	public boolean hasNext()
	{
		return e.hasMoreElements();
	}
	
	public T next()
	{
		return e.nextElement();
	}
	
	public void remove()
	{
		throw new UnsupportedOperationException();
	}
}
