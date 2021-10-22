public class RemoveDuplicatesSolution1 {
    /*
    Write a return method that can remove the duplicated values from String

        Ex:  removeDup("AAABBBCCC")  ==> ABC
     */

    public static void main(String[] args) {
        String str = "AAABBBCCCDDD";
        System.out.println("String with duplicates: " +str);
        System.out.println("String without duplicates: " + removeDup(str));
    }
    public static  String  removeDup( String  str) {

        String result = "";

        for (int i = 0; i < str.length(); i++)

            if (!result.contains("" + str.charAt(i)))

                result += "" + str.charAt(i);



        return result;

    }
}
