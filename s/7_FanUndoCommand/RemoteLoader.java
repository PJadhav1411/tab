
public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		 Fan livingRoomfan = new Fan("LivingRoomfan");	//Receiver
		 
		
		 //Creating ON and OFF for Fan 
		 FanOnCommand livingRoomfanOn = new FanOnCommand(livingRoomfan);
		 FanOffCommand livingRoomfanOff =new FanOffCommand(livingRoomfan);
		
		
		//Setting command
		remoteControl.setCommand(0, livingRoomfanOn, livingRoomfanOff);//Adding fan command to the remote in slot 0
		

		 //client pressing ON button
		 remoteControl.onButtonWasPushed(0);

		 System.out.println("------------------------------------------------");
		
		 //client pressing OFF button
		 remoteControl.offButtonWasPushed(0);
		 
		 remoteControl.undoButtonWasPushed();
		 
		 remoteControl.offButtonWasPushed(0);
	}

}
