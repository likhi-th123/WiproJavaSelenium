package main.java;

public class CodingQuestions {
	
	//print reverse tables
	  public int ReverseTable(int num) {
	        for (int i = 10; i >= 1; i--) {
	            System.out.println(num + " * " + i + " = " + (num * i));
	        }
			return num;
	  }
	
	  //print all alphabets
	public char getAlphabet(char alpha) {
	    for (char ch = 'a'; ch <= 'z'; ch++) {
	        System.out.print(ch + " ");
	    }
	    return alpha;
	}
	
	//print the ASCII values
	public String asciiValue(String c) {
	    for (char ch = 'a'; ch <= 'z'; ch++) {
	        System.out.println(ch + " : " + (int) ch);
	    }
	    return c;
	}
	
	//factorial value of any number
	public int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
	}
	
	//countnumber
	 public String countnumbers(int[] input) {
	        int pos = 0, neg = 0, zero = 0;

	        for (int num : input) {
	            if (num > 0) pos++;
	            else if (num < 0) neg++;
	            else zero++;
	        }

	        return pos + " " + neg + " " + zero;
	    }
	 
	 //findmax and small
	 
	 public String findminmax(int[] input) {
	        if (input.length == 0) return "No input";

	        int min = input[0], max = input[0];

	        for (int num : input) {
	            if (num < min) min = num;
	            if (num > max) max = num;
	        }

	        return max + " " + min;
	    }
	
	//divisible by 9
	public String divisibleby() {
        int sum = 0;
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                sum += i;
                count++;
            }
        }

        return "Count: " + count + ", Sum: " + sum;
    }
	
	//find 1s complement
	
	public int onescompliment(int num) {
		return ~num;
	}
	
	//find 2s complement
	public int twosComplement(int num) {
        return ~num + 1;
    }
	
	//fibonacci
	public int fibonacciSeries(int n) {
	    int a = 0, b = 1;
	    for (int i = 0; i < n; i++) {
	        System.out.print(a + " ");
	        int next = a + b;
	        a = b;
	        b = next;
	    }
	    return n;
	}


}
	
