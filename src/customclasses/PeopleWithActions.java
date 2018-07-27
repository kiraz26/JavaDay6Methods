package customclasses;

public class PeopleWithActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person bob=new Person();
		bob.name="Bob";
		bob.job="java developer";
		bob.age=25;
		bob.gender='M';
		
		int bobage=bob.getAge();
		System.out.println("Bob's age is "+bobage);
		bob.get10();
		bob.getPersonName();
		bob.getName();
		int a= bob.get10();
		System.out.println("the result freom get10 is "+a);
		
		bob.run(3);
		bob.bike();
		bob.swim();
		bob.say("Java is super fun!");
		
		System.out.println("************************");
		
		Person mike=new Person();
		mike.name="Mike";
		mike.job="teacher";
		mike.age=23;
		mike.gender='M';
		
		int x=6;
		mike.run(x);
		mike.bike();
		mike.swim();
		mike.say("Python is better than Java!");
	
	
	}
}


