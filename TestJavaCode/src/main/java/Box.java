package main.java;

public class Box {
	public double areaofcircle(double radius) {
		 return 3.14 * radius * radius;
	}
	
	public double areaoftriangle(double base, double height) {
		return 0.5 * base * height;
	}
	
	public double areaofsquare(double side) {
		return side * side;
	}
	
	public double areaofrectangle(double legnth, double width) {
		return legnth * width;
	}
	
	public double simpleinterest(double p, double r, double t) {
		return (p * r * t)/100;
	}
	
	public double calcamount() {
		 double p = 1000;
	     double r = 5; 
	     double t = 2; 

	     double si = simpleinterest(p, r, t);
	     double amount = si + p * Math.pow((1 + r / 100), t);
	     return amount;
	}

}
