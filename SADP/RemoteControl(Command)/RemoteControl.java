
public class RemoteControl {

	command onCommand;
	command offCommand;
	command undoCommand;
	
	public void setCommand(int slot,command onCommand,command offCommand)
	{
		this.onCommand=onCommand;
		this.offCommand=offCommand;
	}
	
	public void onButtonWasPushed(int slot)
	{
	     onCommand.execute();
	     undoCommand = onCommand;
		
	}
	
	public void offButtonWasPushed( int slot)
	{
		offCommand.execute();	
		undoCommand = offCommand;
	}
	
	public void undoButtonWasPushed()
	{
		undoCommand.undo();
	}
	
}
