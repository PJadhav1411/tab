
 import java.util.ArrayList;
public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	
	ArrayList <String> toppings = new ArrayList<String>();
	
	 public void prepare()
	{
		System.out.println("Prepare" + name);
		System .out.println("Tossing dough....");
		System.out.println("Adding Sauce....");
		for( String toppings:toppings)
		{
			System.out.println(" "+toppings);
		}
	}
	 
	 public void bake()
	 {
		 System.out.println("Bake for 25 min at 350");
	 }
	
	 public void cut()
	 {
		 System.out.println("Cutting pizza into diagonal slices");
	
	 }
	 
	 public void box()
	 {
		 System.out.println("place pizza at offical pizzastore box");
	 
	 }
	
	 public String getName()
	 {
		 return name;
	 }
}
