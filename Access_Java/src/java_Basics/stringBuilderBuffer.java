package java_Basics;

public class stringBuilderBuffer {
	
	public static void main (String[]args) {
		
		//String is immutable String builder and buffer is mutable
		String s = "Hi I'm a String";
		StringBuilder sbl = new StringBuilder("Hi this is String Builder");
		StringBuffer sbf = new StringBuffer("And I'm String Buffer");
		System.out.println(s);
		System.out.println(sbl);
		System.out.println(sbf);
		System.out.println(sbl.append(" - Got you")); // append is to add or concat the string value
		System.out.println(sbl.insert(10, " a")); // insert is to insert a string in the mentioned index
		System.out.println(sbf.delete(0, 3)); //deletes the value starting from index to length
		System.out.println(sbf.replace(0, 1, "Yes ")); //replace the value starting from index to length
		System.out.println(sbf.reverse());
		System.out.println(sbf.length());
		
		char characterAt = sbf.charAt(8);
		System.out.println(characterAt);
		
		String str = sbl.toString();
		System.out.println(str);
	}

}
