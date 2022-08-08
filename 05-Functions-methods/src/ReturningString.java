public class ReturningString {
    public static void main(String[] args) {
        String value = greet();
        System.out.println(value);
    }
    static String greet() {
        String greeting = "How are you";
        return greeting;
    }
}
