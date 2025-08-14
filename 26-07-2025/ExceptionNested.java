package practice;

public class ExceptionNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number= {1000, 20};
		
		
		try {
			System.out.println("outer block");
		try {
            System.out.println("Inner block");
            int result = number[0] / number[1];  
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Inner try's catch: Divide by zero!");
        }

        int value = number[2];  
        System.out.println("Value: " + value);

    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Outer catch: Array index out of bounds!");
    }
	finally{
		System.out.println("Example of outer/Inner try block");
	}

}
}
		

