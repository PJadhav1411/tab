
public class FanOnCommand implements Command {
	Fan fan;
	
	 public FanOnCommand(Fan fan) {
		 this.fan = fan;
		 }
	 
	 
	@Override
	public void execute() {
		 fan.on();
		
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fan.off();
	}
}
