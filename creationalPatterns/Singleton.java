/*
 * Implementation of Singleton Pattern
 * Create by: Ming
 */

package creationalPatterns;

public class Singleton {
	
	public static void main(String[] args)
    {	
		Singleton instance =  Singleton.getInstance();
		
		instance.whoAmI();
    }
	
	private static Singleton instance;
	private Singleton(){};
	
	public static synchronized Singleton getInstance()
	{
		if(instance ==null)
		{
			instance = new Singleton();
		}
		return instance;
	}
	
	public void whoAmI()
	{
		System.out.print("I am a singleton instance.");
	}


}
