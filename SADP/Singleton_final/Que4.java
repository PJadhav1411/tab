
public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1=new Thread(new Runnable()
	    {
	      public void run()
	      {
	        abc obj=abc.getInstance();
	      }
	     });

	     Thread t2=new Thread(new Runnable()
	     {
	       public void run()
	       {
	         abc obj=abc.getInstance();
	       }
	     });

	     t1.start();
	     t2.start();
	}

}
