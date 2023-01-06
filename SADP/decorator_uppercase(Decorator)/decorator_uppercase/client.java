package decorator_uppercase;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		letters l =new words("SANDESH");
		
		System.out.println(l.getword());
		
		/*letters l2=new uppercase_decorator(l);
		System.out.println(l2.getword());*/
		System.out.println("----------------------------------");
		letters l2=new lowercase_decorator(l);
		System.out.println(l2.getword());

	}

}
