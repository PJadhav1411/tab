
public class DecoyDuck extends Duck {

	
	public DecoyDuck() {
		flyBehavior=new FlyNoWay();
		quackbehavior=new Quack();
	}
	@Override
	public void display() {
		System.out.println("Looks like a Decoy  Duck");		
			}

}
