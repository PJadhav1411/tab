
public class FanOffCommand implements Command {

	Fan fan;
	
	 public FanOffCommand(Fan fan) {
		 this.fan = fan;
		 }
	 
	 
	@Override
	public void execute() {
		 fan.on();
		
	}


	@Override
	public void undo() {
		fan.off();
	}

}
