
public class GumballMachine implements Context {

	private State state = new MachineEmpty();

	@Override
	public void setState(State state) {
		this.state = state;
	}

	public void putCoin() {
		state.putCoin(this);
	}

	public void pressButton() {
		state.pressButton(this);
	}

	public void insertGumBalls() {
		state.insertGumBalls(this);
	}

}