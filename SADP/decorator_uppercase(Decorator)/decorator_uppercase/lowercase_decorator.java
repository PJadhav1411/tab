package decorator_uppercase;

public class lowercase_decorator implements letters{
	private letters name;
	 public lowercase_decorator(letters l) {
		 this.name=l;
	 }
		@Override
		public String getword() {
			// TODO Auto-generated method stub
			return name.getword().toLowerCase();
		}

}
