public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        System.out.println("Concatenation: " + str1 + " " + str2);
        System.out.println("Length: " + str1.length());
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Substring: " + str1.substring(1, 4));
        System.out.println("Contains 'ell': " + str1.contains("ell"));
    }
}