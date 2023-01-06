
public class StereoOnWithCDCommand implements Command{
Stereo stereo;

StereoOnWithCDCommand(Stereo stereo){
	this.stereo=stereo;
}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.on();
		
	}

}
