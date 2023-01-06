
public class LightOffCommand implements command {

	Light light;
	
	public LightOffCommand(Light light) {
		this.light=light;
	}
	
	public void execute()
	{
		light.off();
	}
	
	public void undo()
	{
		light.off();
	}
}
