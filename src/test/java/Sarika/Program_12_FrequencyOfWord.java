/*Frequency of   word in Sentence :    "Today is monday and today is wonderful day"
day= 4 times 

Str1=str.repleceAll("day","*") 

"To* is mon* and to* is wonderful *"
day= 4 times*/

package Sarika;

import java.util.ArrayList;
import java.util.Collections;

public class Program_12_FrequencyOfWord {

	public static void main(String[] args) {
		String givenstring = "Today is monday and today is wonderful day";
		String[] words = givenstring.split(" ");


		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			arr.add(words[i]);
		}
		while (arr.size() != 0) {
			String word = arr.get(0);
			int frequency = Collections.frequency(arr, word);
			arr.removeAll(Collections.singleton(word));
			System.out.println(word + frequency);
		}
	}
}
