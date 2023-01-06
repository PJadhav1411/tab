
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Duck mallard=new MallardDuck();
		System.out.println(mallard);
        mallard.performQuack();
		mallard.performFly();
		
		System.out.println("-----------------------------------------");

		Duck redheadduck=new RedheadDuck();
		System.out.println(redheadduck);
		redheadduck.performQuack();
		redheadduck.performFly();

		System.out.println("-----------------------------------------");

		Duck rubberduck=new RubberDuck();
		System.out.println(rubberduck);
		rubberduck.performQuack();
		rubberduck.performFly();

		System.out.println("-----------------------------------------");


		Duck decoyduck=new DecoyDuck();
		System.out.println(decoyduck);
		decoyduck.performQuack();
		decoyduck.performFly();


	}

}
