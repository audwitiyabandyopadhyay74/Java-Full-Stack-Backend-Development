class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.display();
    }
}