
public class MachineStart implements State {

	private int count;

	public MachineStart(int count) {
		this.count = count;
		System.out.println("Inventory: " + count);
	}

	@Override
	public void putCoin(Context context) {
		System.out.println("Coins accepted, press button");
		context.setState(new MachineDispense(count));
	}

	@Override
	public void pressButton(Context context) {
		System.out.println("Err: Insert coins first");
	}

	@Override
	public void insertGumBalls(Context context) {
		System.out.println("Inserted gumballs, machine is working now");
		context.setState(new MachineStart(100));
	}

}

