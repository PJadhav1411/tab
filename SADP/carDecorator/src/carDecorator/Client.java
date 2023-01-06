package carDecorator;

public class Client {

	public static void main(String[] args) {
		
		
		Car car=new BasicCar();	//Object to be decorate
		System.out.println(car.assemble());
		
		System.out.println("----------------------------------");
		

		car=new SportCars(car);	//Decorator
		System.out.println(car.assemble());
		
		
		System.out.println("----------------------------------");
		

		
		//Recursive composition
		/*Car LuxurySports=new LuxuryCar(new SportCars(car));
		System.out.println(LuxurySports.assemble());	*/
		
		car=new LuxuryCar(new SportCars(car));  //Recursive composition
		System.out.println(car.assemble());			
				
	}
}
