
//2. print first non repeating character from a string



package Rupesh1;

public class Program10_FristNonRepetativeChar {
	public static void main(String[] args) {
		String str = "Rupesh here";
		boolean flag = true;

		for (char i : str.toCharArray()) {
			if (str.indexOf(i) == str.lastIndexOf(i)) {
				System.out.println("First non repeating character is: " + i);
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("There is no non repeating character in string");
	}
}
