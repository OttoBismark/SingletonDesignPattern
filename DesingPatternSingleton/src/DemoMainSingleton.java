
public class DemoMainSingleton
{
	public static void main(String args[])
	{
		Singleton object = Singleton.getInstance();
		
		object.message();
	}
}
