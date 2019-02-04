public class Test{ 

	public static void main(String[] args){ 

		Dog d1 = new Dog(); 
		d1.name = "Frodo"; 
		d1.age = 4; 
		d1.breed = "Alsatian"; 

		Dog d2 = new Dog(); 
		d2.name = "Labby"; 
		d2.age = 3; 
		d2.breed = "Labrador"; 

		Dog d3 = d2; 
		d3.age = 6; 
		
		System.out.println(d1.name); // Answer? Frodo
		System.out.println(d2.age); // Answer? 6  - d2 and d3 are now pointing to the same location in memory containing the same object. Any changes to d3 also affect d2.
		System.out.println(d3.age); // Answer? 6
		
		System.out.println(d1.age == d2.age); // Answer? false
		System.out.println(d1 == d2); // Answer? false
		System.out.println(d1 == d3); // Answer? false
		System.out.println(d2 == d3); // Answer? false - true because d2 and d3 point to the same object in memory.

}// main 

}// class