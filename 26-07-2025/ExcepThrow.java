package practice;

public class ExcepThrow {
	public static void CheckAge(int age) {
		
		if(age<18) {
			throw new IllegalArgumentException("access denied, your not eligible to vote");
		}else {
			System.out.println("Access granted – Your eligible to vote!");	
	
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            CheckAge(19);  
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
 
        System.out.println("Program continues...");
    }

}
