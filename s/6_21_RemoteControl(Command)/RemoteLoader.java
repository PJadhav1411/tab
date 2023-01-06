
public class RemoteLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteControl remotecontrol = new RemoteControl();
		
		Light livingroomlight = new Light("livingroom");
		
		 LightOnCommand livingroomlighton = new LightOnCommand(livingroomlight);
		 LightOffCommand livingroomlightoff =new LightOffCommand(livingroomlight);
		
		

		remotecontrol.setCommand(0,livingroomlighton, livingroomlightoff);
		
		remotecontrol.onButtonWasPushed(0);
		
		remotecontrol.offButtonWasPushed(0);
		remotecontrol.undoButtonWasPushed();
		remotecontrol.offButtonWasPushed(0);
		
		
		
		

	}

}
