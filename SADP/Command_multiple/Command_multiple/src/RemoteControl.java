
public class RemoteControl {
	Command[] OnCommand;
	Command[] OffCommand;

	
	RemoteControl() {
		OnCommand=new Command[3];
		OffCommand=new Command[3];
	}
	
	 public void setCommand(int slot,Command OnCommand,Command OffCommand){
		 
		 this.OnCommand[slot]=OnCommand;
		 this.OffCommand[slot]=OffCommand;
		
	}
	 
	 public void onButtonPushed(int slot){
		 this.OnCommand[slot].execute();
	 }

public void offButtonPushed(int slot){
	 this.OffCommand[slot].execute();
	 }

}
