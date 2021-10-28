import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatTwoArrays(new int[] {1,2,3,4,5}, new int[] {6,7,8,9,10})));
    }
    public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for(int each: arr1) {

            result[i] = each;

            i++;

        }

        for(int each: arr2) {

            result[i] =each;

            i++;

        }

        return result;

    }
}
