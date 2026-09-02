package java_Basics;

class univ{
	public void deg() {
		System.out.println("Student gets graduated for a degree");
	}
}

class college extends univ {
	public void placement(){
		System.out.println("Student gets placed in a company");
	}
}

class department extends college{
	public void registration(){
		System.out.println("Student gets registered for anyone of the department");
	}
}

class affiliated extends univ {
	public void enrol(){
		System.out.println("Student gets enrolled for anyone of the department");
	}
}

public class inheritHybrid {
	
	public static void main (String[]args) {
		
		department dept = new department();
		affiliated aff = new affiliated();
		
		dept.deg();
		dept.placement();
		dept.registration();
		aff.deg();
		aff.enrol();
		
	}

}
