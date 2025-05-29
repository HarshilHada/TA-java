class Animal{
	void eat()
	{
		System.out.println("Animal Eat");
	}
}

class Dog extends Animal
{
	void sound()
	{
		
		System.out.println("Dog Barks");
	}
}
class SmallDog extends Dog
{
	void color()
	{
		
		System.out.println("SmallDog is White");
	}
}

class Lion extends Animal
{
	void roar()
	{
		System.out.println("Lion Roars");
	}
}

class Pr1{
	public static void main(String[] args) {
		// Single Inheritance
        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();    
        d.sound();   

        // Multilevel Inheritance
        System.out.println("\nMultilevel Inheritance:");
        SmallDog sd = new SmallDog();
        sd.eat();    
        sd.sound();   
        sd.color();   

        // Hierarchical Inheritance
        System.out.println("\nHierarchical Inheritance:");
        Lion  l = new Lion();
        l.eat();    
        l.roar();   

	}
}
