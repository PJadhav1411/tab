
public class MallardDuck extends Duck {

	
	public MallardDuck() {
		flyBehavior=new FlyNoWay();
		quackbehavior=new Quack();
	}
	@Override
	public void display() {
		System.out.println("Looks like a Mallard");
		
	}

}
