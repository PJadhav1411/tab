
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HeartBeat heartBeat = new HeartBeat();
		
		HeartModelInterface beatModel = new HeartBeatAdapter(heartBeat);
		
		for(int i =0;i<=10;i++)
		{
			System.out.println(beatModel.getBPM());
		}
		
	}

}
