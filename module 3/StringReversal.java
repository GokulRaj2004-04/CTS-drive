public class StringReversal {
    public static void main(String[] args) {
        String original = "hello";
        StringBuilder reversed = new StringBuilder(original).reverse();
        System.out.println("Reversed string: " + reversed);
    }
}
