package java_Basics;

public class stringsType {
	
	public static void main (String[]args) {


	String m = "MN";
	String m1 = new String ("mn");
	String n = "hi how are you?";
	
	System.out.println(m.length()); //in array while using length () is not req in String it is req, this is find the length
	System.out.println(m.charAt(1)); //to find the character at given index value
	System.out.println(m.toLowerCase()); //to convert string to lower case
	System.out.println(n.toUpperCase()); //to convert string to upper case
	System.out.println(m.equals(m1)); //to check the given string is equal with comparative string without ignoring the case
	System.out.println(m.equalsIgnoreCase(m1)); //to check the given string is equal with comparative string ignoring the case
	System.out.println(n.contains("are")); // to check whether the given value is present in the string
	System.out.println(n.startsWith("hi")); // to check whether the given value is the starting of the string
	System.out.println(n.endsWith("?")); // to check whether the given value is the ending of the string
	System.out.println(n.indexOf('a')); // to check the index value of the given char
	System.out.println(m1.indexOf(n)); //if there is no value, it returns -1
	System.out.println(n.substring(1, 5)); //to print the value within the given limits
	System.out.println(n.replace('h', 'H')); //to replace the character
	
	String a = " Today ";
	System.out.println(a.trim()); // to remove space front and back of the string
	
	String[] split = n.split(" "); // to split the string value with given special character which is present in the string
	
	System.out.println(split[1]);
	
	}
}
