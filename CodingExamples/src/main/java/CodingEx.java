package main.java;

public class CodingEx {
	
	//twostringconcatenate
	public String concatenate(String str1, String str2) {
	    return str1 + str2;
	}
	
	//remove blank space
	public String removespace(String str) {
		return str.replace(" ", "");
	}

	//count letters, digits, special
	public String countCharacters(String str) {
	    int letters = 0;
	    int digits = 0;
	    int special = 0;

	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        if (Character.isLetter(ch)) {
	            letters++;
	        } else if (Character.isDigit(ch)) {
	            digits++;
	        } else {
	            special++;
	        }
	    }
	    return letters + " " + digits + " " + special;
	}

	
	//replaceFirstVowel
	public String replaceFirstVowel(String str) {
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if ("aeiouAEIOU".indexOf(ch) != -1) {
		        return str.substring(0, i) + '-' + str.substring(i + 1);
		    }
		}
	    return str;
	}
	
	
	//highestFrequencyChar
	public char highestFrequencyChar(String str) {
		int[] freq = new int[256];
	    for (char ch : str.toCharArray()) {
	    	freq[ch]++;
	    }
	    char maxChar = 0;
	    int maxFreq = 0;
	    for (char ch : str.toCharArray()) {
	    	if (freq[ch] > maxFreq) {
	    		maxFreq = freq[ch];
	            maxChar = ch;
	            }
	        }

	        return maxChar;
	    }



}
