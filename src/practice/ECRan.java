package practice;

public class ECRan {
    public static void main(String[] args) {
    	try {
    		   int a = 5 / 0;
    		} catch (ArithmeticException e) {
    		  System.out.println("Exception caught");
    		} finally {
    		   System.out.println("Finally block");
    		}
}
}