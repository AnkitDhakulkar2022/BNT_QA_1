

//Write a function to find out longest  in a given string []
///p  : {�nitin�, �jadeja�, �mama� , �Madam Im Adam�}
//o/p : Madam Im Adam



package Rupesh1;

public class Program11_LongestString {
	public static String longeststr(String[] array) {
		int maxlen = 0;
		String longestString = null;
		for (String s : array) {
			if (s.length() > maxlen) {
				maxlen = s.length();
				longestString = s;
			}
		}
		return longestString;
	}

	public static void main(String[] args) {
		String[] str1 = { "nitin", "jadeja", "mama", "Madam Im Adam" };
		String longestString = longeststr(str1);
		System.out.format("longest string: '%s'\n", longestString);
	}
}
