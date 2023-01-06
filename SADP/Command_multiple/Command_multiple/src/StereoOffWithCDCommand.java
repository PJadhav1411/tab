
public class StereoOffWithCDCommand implements Command {
	Stereo stereo;

	StereoOffWithCDCommand(Stereo stereo){
		this.stereo=stereo;
	}
		@Override
		public void execute() {
			// TODO Auto-generated method stub
			stereo.off();
			
		}
}
