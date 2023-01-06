
public class PizzaStoreTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("veggie");//NYStyleCheesePizza
		System.out.println("First order was a " + pizza.getName() + "\n");
	

		System.out.println("----------------------------------------");
		
		pizza = chicagoStore.orderPizza("Chesse");
		System.out.println("Second order was a " + pizza.getName() + "\n");
		


	}

}
