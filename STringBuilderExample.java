
public class STringBuilderExample {
     public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");  // Hello World
        sb.insert(5, ",");    // Hello, World
        sb.replace(6, 12, " Java"); // Hello, Java
        sb.delete(5, 6);      // Hello Java
        sb.reverse();         // avaJ olleH

        System.out.println("Final StringBuilder: " + sb);
    }
}
