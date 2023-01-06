
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LunchMenu lunchmeun = new LunchMenu();
		PrintMenu(lunchmeun.getIterator());
		
		BreakFastMeun breakfastmeun = new BreakFastMeun();
		PrintMenu(breakfastmeun.getIterator());

	}
	
	public static void PrintMenu(Iterator<String> items)
	{
		while(items.hasNext())
		{
			System.out.println(items.next());
		}
	}

}
