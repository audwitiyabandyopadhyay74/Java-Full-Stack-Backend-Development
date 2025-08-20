public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (widening)
        int intVal = 100;
        long longVal = intVal;
        float floatVal = longVal;
        double doubleVal = floatVal;
        
        System.out.println("Implicit casting: " + doubleVal);
        
        // Explicit casting (narrowing)
        double d = 9.78;
        int i = (int) d;
        
        System.out.println("Explicit casting: " + i);
    }
}
