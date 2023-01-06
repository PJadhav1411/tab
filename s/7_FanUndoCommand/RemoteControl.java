
public class RemoteControl {
	Command onCommand;
	 Command offCommand;
	 Command undocommand;
	 
	/* public RemoteControl() {
		 onCommands = new Command[5];
		 offCommands = new Command[5];
		 
	 }
	 	*/
	
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		 this.onCommand = onCommand;
		 this.offCommand= offCommand;
		 }
	
	public void onButtonWasPushed(int slot) {
		 onCommand.execute();
		 undocommand = onCommand;
		 }
	
	
	public void offButtonWasPushed(int slot) {
		 offCommand.execute();
		 undocommand = offCommand;
		 }
		 
	 public void undoButtonWasPushed() {
		 undocommand.undo();
		 }
	
	
	}


