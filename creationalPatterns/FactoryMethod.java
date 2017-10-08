/*
 * Implementation of Factory Method Pattern
 * Create by: Ming
 */

package creationalPatterns;

public class FactoryMethod {
	
	public static void main(String[] args)
    {	
		Factory factory = new FactoryMethod().new LightFactory();
		Light light = factory.createLight();
		light.showLight();
		
    }
	
	//Abstract Factory for Light
	public abstract class Factory
	{
		protected abstract Light getLight(); 
		
		public Light createLight()
		{
			Light light = getLight();
			return light;
		}
		
		
	}
	
	//Concrete Factory for Light
	public class LightFactory extends Factory 
	{

		protected Light getLight() {
			
			return new conreteLight();
		}
		
	}
	
	//Product Interface
	public interface Light
	{
		public void showLight();
		
	}
	
	//Concrete Product Class
	public class conreteLight implements Light
	{

		public void showLight() {
			
			System.out.print("This is a new Light.");
			
		}
		
	}

}