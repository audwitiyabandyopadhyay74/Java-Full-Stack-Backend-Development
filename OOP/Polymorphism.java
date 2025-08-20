class Shape {
    public void area() {
        System.out.println("Calculating area");
    }
}

class Circle extends Shape {
    public void area() {
        System.out.println("Circle area = π * r²");
    }
}

class Rectangle extends Shape {
    public void area() {
        System.out.println("Rectangle area = length * width");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        
        shape1.area();
        shape2.area();
    }
}