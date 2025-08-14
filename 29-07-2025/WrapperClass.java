package day8pgm;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;                      // primitive data type
		Integer obj = Integer.valueOf(num); // manual boxing
		int x = obj.intValue();           // manual unboxing
		System.out.println("auto-unboxing:" +x);
		System.out.println("autoboxing:"+obj);

	}

}
