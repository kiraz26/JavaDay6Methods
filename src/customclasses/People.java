package customclasses;

public class People {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person();
		p1.name="Bob";
		p1.age=25;
		p1.gender='M';
		p1.job="SDET";
		
		
		Person p2=new Person();
		p2.name="Halil";
		p2.age=28;
		p2.gender='M';
		p2.job="Hacker";

		Person p3=new Person();
		p3.name="Jennifer";
		p3.age=24;
		p3.gender='F';
		p3.job="Nurse";

		Person p4=new Person();
		p4.name="Micheal";
		p4.age=26;
		p4.gender='M';
		p4.job="Student";
		
		int a= p1.get10();
		System.out.println("the result freom get10 is "+a);
		
		String simpleName=p1.getPersonName();
		System.out.println(simpleName);
		System.out.println("p1 actual name is "+p1.getName());
		
		
		
	
	}

}
