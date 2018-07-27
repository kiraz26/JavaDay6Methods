package customclasses;

public class Person {
	
	String name;
	int age;
	char gender;
	String job;
	
	public int getAge() {
		System.out.println("getting age "+age);
		return age;
		
	}
	public int get10() {
		System.out.println("getting 10");
		return 10;
	}
	public String getPersonName() {
		
		return "my own name";
	}
	public String getName() {
		
		return name;
	}
	
	
	public void run(int miles) {     
		//public-means everyone can access it 
		//void - means nothing is returned from this method
		//     - this method only performs some steps but does not give anything back
		System.out.println(name+" is running "+miles+" miles");
		
	}	
		
	public void bike() {
		System.out.println(name+" is biking");
	
	}
	
	public void swim() {
		System.out.println(name+" is swimming");
	}
	
	public void say(String speech) {
		System.out.println(speech);
	}
}
