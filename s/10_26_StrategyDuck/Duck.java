
public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackbehavior;
	public void swim() {
		System.out.println("All ducks float on water");
	}
	
	
	public abstract void display();
	
	
	//doSomething()
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackbehavior.quack();
	}


}
