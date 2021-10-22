public class ReverseSolution2 {
    public static void main(String[] args) {
        System.out.println(Reverse("HELLO"));
    }
    public  static String  Reverse(String str) {

        return new StringBuffer(str).reverse().toString();

    }
}
