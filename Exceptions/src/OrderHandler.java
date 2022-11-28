/**
 * This program outputs exception errors using printStackTrace();
 * And it explains about hierachy of exception
 * @author Juho Lee
 * @version 11.0.15
 * @since 1.8.0_342
 */
import java.io.IOException;
public class OrderHandler {
	
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Exception A = new Exception();
        IOException B = new IOException(); 

        OrderHandler OrderHandler = new OrderHandler();
        
//		try {
//			throw new Exception();
//		} catch (Exception e) {
//	           System.out.println("Class name: " + e.getClass().getSimpleName());
//	            e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("Class name: " + e.getClass().getSimpleName());
//            e.printStackTrace();
//		}
		
		try {
			throw new Exception();
		} catch (IOException e) {
			System.out.println("Class name: " + e.getClass().getSimpleName());
            e.printStackTrace();
		} catch (Exception e) {
	           System.out.println("Class name: " + e.getClass().getSimpleName());
	            e.printStackTrace();
		}
		
    }}    