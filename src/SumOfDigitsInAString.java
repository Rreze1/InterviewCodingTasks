public class SumOfDigitsInAString {
    /*
    String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
ex: "12345" - 15
"ABC123"-6

     */
    public static void main(String[] args) {
        System.out.println(sumOfDigits("12345"));
        System.out.println(sumOfDigits("ABC123"));
    }
    public  static int  sumOfDigits(String s) {

        int total = 0;

        char[] ch =  s.toCharArray();

        for(char each: ch) {

            if(Character.isDigit(each)) {

                total += Integer.valueOf(""+each);

            }

        }

        return total;

    }
}
