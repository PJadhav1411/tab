package carDecorator;

public class LuxuryCar implements Car{

	Car car;
	
	public LuxuryCar( Car car) {
		this.car=car;
	}
	@Override
	public String assemble() {
		// TODO Auto-generated method stub
		
		return "Adding luxury car features to "+this.car.assemble();
		
		
		
	}
}
