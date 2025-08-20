public class Methods {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        greet("World");
        int result = add(5, 3);
        System.out.println("Sum: " + result);
    }
}