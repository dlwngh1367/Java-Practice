
/**
 * This program outputs exception errors using printStackTrace();
 * @author Juho Lee
 * @version 11.0.15
 * @since 1.8.0_342
 */
public class CatHandler {

    public static class ExceptionAlpha extends Exception{}
    public static class ExceptionBeta extends ExceptionAlpha {}
    public static class ExceptionGamma extends ExceptionBeta {}
    
// a1 method throws ExceptionBeta
    public void a1() throws ExceptionBeta {
        throw new ExceptionBeta();
    }
 // a1 method throws ExceptionGamma
    public void a2() throws ExceptionGamma {
        throw new ExceptionGamma();
    }

    public static void main(String[] args) {
        CatHandler catHandler = new CatHandler();
        
        try {
            catHandler.a1();
        } catch (ExceptionAlpha e) {
            System.out.println("Class name: " + e.getClass().getSimpleName());
            e.printStackTrace();
        }

        try {
            catHandler.a2();
        } catch (ExceptionAlpha e) {
            System.out.println("Class name: " + e.getClass().getSimpleName());
            e.printStackTrace();
        }
    }
}