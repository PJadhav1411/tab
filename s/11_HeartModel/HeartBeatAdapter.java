
public class HeartBeatAdapter implements HeartModelInterface{

	public HeartBeat heartBeat;
	
	public HeartBeatAdapter(HeartBeat heartBeat)
	{
		super();
		this.heartBeat=heartBeat;
	}
	
	public void setBPM(int bpm)
	{
		
	}
	
	public int getBPM()
	{
		return heartBeat.getHeartRate();
	}
	
}
