package RUPESH;

public class Assignment_2 {
	public static String reverseWord(String str){  
	    String words[]=str.split("Today is good day");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}  
}