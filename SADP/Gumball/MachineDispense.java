
public class MachineDispense implements State {

	private int count;

	public MachineDispense(int count) {
		this.count = count;
	}

	@Override
	public void putCoin(Context context) {
		System.out.println("Err: Coin already inserted, press button");
	}

	@Override
	public void pressButton(Context context) {
		System.out.println("Button pressed, collect gumballs");
		if (count - 20 <= 0)
			context.setState(new MachineEmpty());
		else
			context.setState(new MachineStart(count - 20));
	}

	@Override
	public void insertGumBalls(Context context) {
		System.out.println("Inserted gumballs, press button");
		context.setState(new MachineDispense(100));
	}

}
