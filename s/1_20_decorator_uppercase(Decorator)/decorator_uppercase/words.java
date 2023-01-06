package decorator_uppercase;

public class words implements letters {

	public String name;
	
	
	public  words(String name) {
		this.name=name;
	}
	@Override
	public  String getword() {
	return name;	
	}

	
	public String change() {
		
		return name;
	}
}
