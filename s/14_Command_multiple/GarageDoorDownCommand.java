
public class GarageDoorDownCommand implements Command {
Garage garage;
	
GarageDoorDownCommand(Garage garage){
		this.garage=garage;
	}
	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		garage.down();
		
	}

}
