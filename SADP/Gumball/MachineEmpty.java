
public class MachineEmpty implements State {

	public MachineEmpty() {
		System.out.println("Machine is empty");
	}
	
	@Override
	public void putCoin(Context context) {
		System.out.println("ERR: Machine is empty");
	}

	@Override
	public void pressButton(Context context) {
		System.out.println("ERR: Machine is empty");
	}

	@Override
	public void insertGumBalls(Context context) {
		System.out.println("Inserted gumballs, machine is working now");
		context.setState(new MachineStart(100));
	}

}