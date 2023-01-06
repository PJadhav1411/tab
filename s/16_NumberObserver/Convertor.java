
public class Convertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberData numberData = new NumberData();
		
		Binary binary = new Binary(numberData);
		Octal octal=new Octal(numberData);
		HexaDecimal hex=new HexaDecimal(numberData);
		
		numberData.setNumber(10);
		
		System.out.println("---------------");
		
		numberData.setNumber(15);
		
		System.out.println("---------------");
		
		numberData.setNumber(20);
		
		

	}

}
