/**
 * This program outputs exception errors using printStackTrace();
 * @author Juho Lee
 * @version 11.0.15
 * @since 1.8.0_342
 */
public class FishHandler {

	public class easterEnding extends Exception {}
	public class easterStarting extends Exception {}
	
	public void easterEnding() throws easterStarting{};
	public void easterStarting() throws easterEnding{
        try {
        	throw new easterEnding();
        } catch (Exception e) {
            System.out.println("Class name: " + e.getClass().getSimpleName());
            e.printStackTrace();
        }
	};
	
	public static void main(String[] args) {
		FishHandler FishHandler = new FishHandler();
		try {
			FishHandler.easterStarting();
		} catch (Exception e) {
	           System.out.println("Class name: " + e.getClass().getSimpleName());
	            e.printStackTrace();
		}
		
		
		
}}
