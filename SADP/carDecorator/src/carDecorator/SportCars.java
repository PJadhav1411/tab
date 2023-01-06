package carDecorator;

public class SportCars implements Car {

	Car car;
	
	public SportCars( Car car) {
		this.car=car;
	}
	@Override
	public String assemble() {
		// TODO Auto-generated method stub
		
		return "Adding Sports car features to "+ this.car.assemble();
		
		
		
	}

}
