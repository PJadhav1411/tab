
public class RedheadDuck extends Duck{

	
	public RedheadDuck() {
		flyBehavior=new FlyWithWings();
		quackbehavior=new Quack();
	}
	@Override
	public void display() {
System.out.println("Looks like a Redhead Duck");		
	}

}
