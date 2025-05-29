
class Person {
    String name;
    int age;

    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    Person(Person New_Person) {
        this.name = New_Person.name;
        this.age = New_Person.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Pr3 {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        System.out.println("Original Person:");
        person1.display();

        Person person2 = new Person(person1);
        System.out.println("New Copied Person:");
        person2.display();
    }
}

