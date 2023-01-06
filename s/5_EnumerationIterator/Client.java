import java.util.Arrays;
import java.util.Vector;
import java.util.Enumeration;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector vector = new Vector(Arrays.asList(1,2,3,4,5,6,7,8));
		Enumeration<Integer> enumeration = vector.elements();
		
	    Iterator<Integer> iterator = new EnumerationIterator<Integer> (enumeration);
	    
	    while(iterator.hasNext())
	    {
	    	System.out.println(iterator.next());
	    }
	
	
	

		
	}

}
