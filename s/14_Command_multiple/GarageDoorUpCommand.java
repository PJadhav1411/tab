
public class GarageDoorUpCommand implements Command{

	Garage garage;
	
	GarageDoorUpCommand(Garage garage){
		this.garage=garage;
	}
	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		garage.up();
		
	}

}
