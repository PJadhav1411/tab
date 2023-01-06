
public class RemoteLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteControl remotecontrol=new RemoteControl();
		
		Light livingRoomlight=new Light("LivingRoomLight");
		LightOnCommand livingRoomlight_oncommand=new LightOnCommand(livingRoomlight);
		LightOffCommand livingRoomlight_offcommand=new LightOffCommand(livingRoomlight);
		
		Garage garageDoor=new Garage("Garage Door");
		GarageDoorUpCommand garagedoor_upcommand=new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garagedoor_downcommand=new GarageDoorDownCommand(garageDoor);
		
		
		Stereo stereo=new Stereo("Stereo");
		StereoOnWithCDCommand stereo_oncommand=new StereoOnWithCDCommand(stereo);
		StereoOffWithCDCommand stereo_offcommand=new StereoOffWithCDCommand(stereo);

	
	remotecontrol.setCommand(0, livingRoomlight_oncommand, livingRoomlight_offcommand);
	remotecontrol.setCommand(1, garagedoor_upcommand, garagedoor_downcommand);
	remotecontrol.setCommand(2, stereo_oncommand, stereo_offcommand);
	
	
	System.out.println("Pressing on\n");
	remotecontrol.onButtonPushed(0);
	remotecontrol.onButtonPushed(1);
	remotecontrol.onButtonPushed(2);
	
	System.out.println("--------------------------------------\n");

	System.out.println("Pressing off\n");
	remotecontrol.offButtonPushed(0);
	remotecontrol.offButtonPushed(1);
	remotecontrol.offButtonPushed(2);
	
		

	}

}
