package sit.model;

public class ExceptionHandler {

    public static double dividedByZero(int dividend, int divider)
            throws ArithmeticException, NegativeDividerException {
        System.out.println("---dividedByZero begin---");
        double result = 0;
        if (divider < 0) {
            throw new NegativeDividerException("Negative Divider");

        }
        result = dividend / divider;
//        try {
//            result = dividend / divider;//throw new ArithmeticException();
//            System.out.println("Try block");
//            
//        } catch (ArithmeticException ae) {
//            ae.printStackTrace();
//        }
//        finally{
//            System.out.println("finally #1");
//            System.out.println("finally #2");
//        } 

        System.out.println("---dividedByZero end---");
        return result;
    }

    public static double doSomeThing()
            throws ArithmeticException, NegativeDividerException {
        System.out.println("---doSomeThing begin---");
        double answer = 0;
//        try {

        answer = dividedByZero(5, -2);
//            
//        } catch (ArithmeticException ae) {
//            ae.printStackTrace();
//        
//        } catch (NegativeDividerException ae) {
//            System.out.println("Negative Catch working: "+ae.getMessage());
//        }
//        finally{
//            System.out.println("finally #1");
//            System.out.println("finally #2");
//        } 
        System.out.println("---doSomeThing end---");
        return answer;
    }

    public static void main(String[] args) throws NegativeDividerException {
        System.out.println("---main begin---");
        double dividedResult = doSomeThing();
        System.out.println("Result=" + dividedResult);
        System.out.println("---main end---");
    }

}
