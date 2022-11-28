/**
 * This program outputs exception errors using printStackTrace();
 * @author Juho Lee
 * @version 11.0.15
 * @since 1.8.0_342
 */
import java.io.IOException;


public class DogHandler {
	
	public static class ExceptionDog extends Exception{}
	public static class ExceptionPuppy extends ExceptionDog{}

    public void b1() throws ExceptionDog {
        throw new ExceptionDog();
    }

    public void b2() throws ExceptionPuppy {
        throw new ExceptionPuppy();
    }
    
    public void b3() throws NullPointerException {
        throw new NullPointerException();
    }
    
    public void b4() throws IOException {
        throw new IOException();
    }
    
	public static void main(String[] args) {
		
		DogHandler DogHandler = new DogHandler();
		
	        try {
	        	DogHandler.b1();
	        } catch (ExceptionDog e) {
	            System.out.println("Class name: " + e.getClass().getSimpleName());
	            e.printStackTrace();
	        }

	        try {
	        	DogHandler.b2();
	        } catch (ExceptionPuppy e) {
	            System.out.println("Class name: " + e.getClass().getSimpleName());
	            e.printStackTrace();
	        }
	        
	        try {
	        	DogHandler.b3();
	        } catch (NullPointerException e) {
	            System.out.println("Class name: " + e.getClass().getSimpleName());
	            e.printStackTrace();
	        }
	        
	        try {
	        	DogHandler.b4();
	        } catch (IOException e) {
	            System.out.println("Class name: " + e.getClass().getSimpleName());
	            e.printStackTrace();
	        }
    
	        
//	        finally{
//	            System.out.println("Executed");
//	        }
	        
	}
	
}
