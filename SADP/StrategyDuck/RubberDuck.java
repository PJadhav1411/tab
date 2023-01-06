
public class RubberDuck extends Duck{

	
	public RubberDuck() {
		flyBehavior=new FlyNoWay();
		quackbehavior=new Squeak();
	}
	@Override
	public void display() {
		System.out.println("Looks like a Rubber Duck");		
			}

}
