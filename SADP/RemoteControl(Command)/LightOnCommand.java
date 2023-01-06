
public class LightOnCommand implements command {
	Light light;
	
	public LightOnCommand(Light light)
	{
		this.light=light;
	}
	
	public void execute()
	{
		light.on();
	}
	public void undo()
	{
		light.off();
	}

}
