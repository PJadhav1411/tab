package decorator_uppercase;

public class uppercase_decorator implements letters {
 private letters name;
 
 public uppercase_decorator(letters l) {
	 this.name=l;
 }
	@Override
	public String getword() {
		// TODO Auto-generated method stub
		return name.getword().toUpperCase();
	}

}
