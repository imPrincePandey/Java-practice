package oop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here we calling object's properties and behaviors 
				Student s1= new Student();
				s1.roll=11;
				s1.name="Ajay";
				s1.age= 22;
				System.out.println(s1.roll);
				System.out.println(s1.name);
				System.out.println(s1.age);
				
				//we can add one more object 
				
				Student s2=new Student();
				s2.roll=12;
				s2.name= "Amit";
				System.out.println(s2.roll);
				System.out.println(s2.name);
				
				
				s1.study();
				s1.prepareInterview(); 
				s2.study();


	}

}
