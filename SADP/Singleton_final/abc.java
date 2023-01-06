
public class abc {


    public static abc instance;

    public abc()
    {
      System.out.println("\n Hello this is multithread object");
    }

    public static synchronized abc getInstance()
    {
      if(instance==null)
      {
        instance=new abc();
      }
      return instance;
    }

}
