package java_Basics;

public class encapSimpleTask {

	public static void main(String[]args) {
		
		aadhaar a = new aadhaar();
		a.age(52);
		a.name("Hon' CM Vijay");
		System.out.println(a.setAge());
		System.out.println("Most famous person now in South India is "+a.setName()+". Whose age is "+a.setAge());
	}
	
}

class aadhaar{
	
	private int age;
	private String name;
	
	public void age(int age) {
		this.age = age;
	}
	
	public int setAge() {
		return age;
	}
	
	public void name(String name) {
		this.name=name;
	}
	
	public String setName() {
		return name;
	}
	
}
